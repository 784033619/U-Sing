package com.QST.Using.Controller;

import com.QST.Using.Etitys.User;
import com.QST.Using.Service.UserService;
import com.QST.Using.Util.Param.JsonToBean;
import com.QST.Using.Util.Param.MapToJsonstr;
import com.QST.Using.Util.Result;
import com.QST.Using.Util.StateAndMessage.StateAndMessage;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.CodeResult;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.VerifiCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 用户模块控制器
 */

@Controller(value = "userController")
@CrossOrigin
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
    @ResponseBody
    public Result getVerifiCode(@RequestBody User user, HttpSession session){
        String param = "";
        String uid = "";
        String mobile = user.getUsername();
        if(!mobile.isEmpty()){
            param =  String.valueOf(new Random().nextInt(899999) + 100000);
            String result=VerifiCode.InstantiationRestAPI().sendSms(SID,TOKEN,APPID,TEMPLATEID,param,mobile,uid);
            CodeResult codeResult = CodeResult.getCodeResult(result);
            if(!"000000".equals(codeResult.getCode())){
                return new Result(StateAndMessage.FAIL,StateAndMessage.VERIFICODEMESSAGE,null);
            }
            System.out.println(param);
            session.setAttribute("verifiCode",param);
            System.out.println(session);
        }
        return new Result(StateAndMessage.SUCCESS,null,null);
    }

    /**
     * 用户注册
    // * @param user
    // * @param code
     * @param session
     * @return
     */
    @RequestMapping("/register")
    public @ResponseBody Result register(@RequestBody Map <String,Object> map, HttpSession session){
        Map userM = (Map) map.get("user");
        JsonToBean userB = new JsonToBean<User>();
        User user = (User) userB.jsonToBean(MapToJsonstr.mapToJsonstr(userM),User.class);
        String code = (String) map.get("code");
        System.out.println(user);
        System.out.println(code);
        System.out.println(session);
        if(user!=null){
//            校验验证码
            System.out.println(session);
            System.out.println(session.getAttribute("verifiCode"));
//            if(code.equals(session.getAttribute("verifiCode"))){
               int result = userService.savaUser(user);
//               if(result == 0){
//                   return new Result(StateAndMessage.FAIL,StateAndMessage.REGISTFMESSAGE,null);
//               }
                System.out.println(1);
 //           }
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
        List<User> users = userService.getUserByUsername(user);
        if(users.isEmpty()){
            return new Result(StateAndMessage.FAIL,StateAndMessage.USERNAMEREPEAT,null);
        }
        return new Result(StateAndMessage.SUCCESS,StateAndMessage.REGISTSMESSAGE,null);
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @RequestMapping("login")
    public @ResponseBody Result login(@RequestBody User user,HttpSession session){
        System.out.println(user);
        Result result = new Result();
        List<User> list = userService.login(user);
        System.out.println(list);
        if (!list.isEmpty()){
            User user1 = list.get(0);
            if(user.getPassword().equals(user1.getPassword())){
                result.setState(StateAndMessage.SUCCESS);
                result.setMessage(StateAndMessage.LOGINSMESSAGE);
                session.setAttribute("user",user);
            }else{
                result.setMessage(StateAndMessage.LOGINFUSERNAME);
                result.setState(StateAndMessage.FAIL);
            }
        }else{
            result.setState(StateAndMessage.FAIL);
            result.setMessage(StateAndMessage.LOGINFUSERNAME);
        }
        return result;
    }
}
