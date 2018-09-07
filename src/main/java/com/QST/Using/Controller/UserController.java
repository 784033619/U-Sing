package com.QST.Using.Controller;

import com.QST.Using.Etitys.User;
import com.QST.Using.Service.UserService;
import com.QST.Using.Util.Result;
import com.QST.Using.Util.StateAndMessage.StateAndMessage;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.CodeResult;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.VerifiCode;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * 用户模块控制器
 */

@Controller(value = "userController")
@RequestMapping("/user")
public class UserController {
    //用户唯一ID
    private final String  SID = "75a45e2aede387ce3560d937f2f38bb1";
    //用户唯一Token码
    private final String TOKEN = "ffe236f976ba5a8bae0c40b6cca39d4a";
    //应用ID
    private final String APPID = "bea1d8da1ca848b2949c4c712f7839f5";
    //短信发送模板ID
    private final String TEMPLATEID = "371640";

    @Resource(name = "userService")
    private UserService userService;


    /**
     * 验证码获取
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("/verifiCode")
    public @ResponseBody Result getVerifiCode(@RequestBody User user, HttpSession session){
        String param = "";
        String uid = "";
        String mobile = user.getUsername();
        if(!user.getUsername().isEmpty()){
            param =  String.valueOf(new Random().nextInt(899999) + 100000);
            String result=VerifiCode.InstantiationRestAPI().sendSms(SID,TOKEN,APPID,TEMPLATEID,param,mobile,uid);
            CodeResult codeResult = CodeResult.getCodeResult(result);
            if(!"000000".equals(codeResult.getCode())){
                return new Result(StateAndMessage.FAIL,StateAndMessage.VERIFICODEMESSAGE,null);
            }
            session.setAttribute("verifiCode",param);
        }
        return new Result(StateAndMessage.SUCCESS,null,null);
    }

    /**
     * 用户注册
     * @param user
     * @param code
     * @param session
     * @return
     */
    @RequestMapping("/register")
    public @ResponseBody Result register(@RequestBody User user,@RequestBody String code,HttpSession session){
        if(user!=null){
            //校验验证码
            if(code.equals(session.getAttribute("verifiCode"))){
               int result = userService.savaUser(user);
               if(result == 0){
                   return new Result(StateAndMessage.FAIL,StateAndMessage.REGISTFMESSAGE,null);
               }
            }
        }
        return new Result(StateAndMessage.SUCCESS,StateAndMessage.REGISTSMESSAGE,null);
    }

    /**
     * 校验手机号（即用户名）是否重复
     * @param user
     * @return
     */
    @RequestMapping("verifyMobile")
    public @ResponseBody Result verifyMobile(@RequestBody User user){
        User userCheck = userService.findUserByUsername(user);
        if(userCheck!=null){
            return new Result(StateAndMessage.FAIL,StateAndMessage.USERNAMEREPEAT,null);
        }
        return new Result(StateAndMessage.SUCCESS,StateAndMessage.REGISTSMESSAGE,null);
    }

}
