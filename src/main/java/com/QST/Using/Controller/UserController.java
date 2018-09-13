package com.QST.Using.Controller;

import com.QST.Using.Etitys.User;
import com.QST.Using.Service.UserFileService;
import com.QST.Using.Service.UserService;
import com.QST.Using.Util.Param.JsonToBean;
import com.QST.Using.Util.Param.MapToJsonstr;
import com.QST.Using.Util.Result;
import com.QST.Using.Util.StateAndMessage.StateAndMessage;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.CodeResult;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.VerifiCode;

import com.QST.Using.Util.WebKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * 用户模块控制器
 */

@Controller(value = "userController")
@CrossOrigin
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Resource(name = "userService")
    private UserService userService;
    @Resource(name = "userFileService")
    private UserFileService userFileService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 验证码获取
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("verifiCode")
    public Result getVerifiCode(@RequestBody User user, HttpSession session){
        String param = "";
        String uid = "";
        String mobile = user.getUsername();
        if(!mobile.isEmpty()){
            param =  String.valueOf(new Random().nextInt(899999) + 100000);
            String result=VerifiCode.InstantiationRestAPI().sendSms(WebKeys.SID,WebKeys.TOKEN,WebKeys.APPID,WebKeys.TEMPLATEID,param,mobile,uid);
            CodeResult codeResult = CodeResult.getCodeResult(result);
            if(!"000000".equals(codeResult.getCode())){
                return new Result(StateAndMessage.FAIL,StateAndMessage.VERIFICODEMESSAGE,null);
            }
            System.out.println(param);
            session.setAttribute(WebKeys.verifiCode,param);
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
    @RequestMapping("register")
    public Result register(@RequestBody Map <String,Object> map, HttpSession session){
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
            System.out.println(session.getAttribute(WebKeys.verifiCode));
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
    public Result verifyMobile(@RequestBody User user){
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
    public  Result login(@RequestBody User user,HttpSession session){
        System.out.println(user);
        Result result = new Result();
        List<User> list = userService.login(user);
        System.out.println(list);
        if (!list.isEmpty()){
            User user1 = list.get(0);
            if(user.getPassword().equals(user1.getPassword())){
                result.setState(StateAndMessage.SUCCESS);
                result.setMessage(StateAndMessage.LOGINSMESSAGE);
                session.setAttribute(WebKeys.username,user1);
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

    /**
     * 获取个人信息
     * @param session
     * @return
     */
    @RequestMapping("getPersonalInfo")
    public Result getPersonalInfo(HttpSession session){
        User user = (User) session.getAttribute("user");
        User userInfo = userService.getPersonalInfo(user.getId());
        if(userInfo==null){
            return new Result(StateAndMessage.FAIL,null,null);
        }
        return new Result(StateAndMessage.SUCCESS,null,userInfo);
    }

    /**
     * 更新个人信息
     * @param user
     * @return
     */
    public Result updatePersonalInfo(User user){
        int rows = userService.updatePersonal(user);
        if(rows<=0){
            return new Result(StateAndMessage.FAIL,null,null);
        }
        return new Result(StateAndMessage.FAIL,null,null);
    }

    /**
     * 用户头像上传
     * @param session
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping("uploadHeadPortrait")
    public Result uploadHeadPortrait(HttpSession session, @RequestParam("file")MultipartFile file) throws IOException {
        logger.info(session.getId()+ (String) session.getAttribute(WebKeys.username));
        User user = (User) session.getAttribute(WebKeys.username);
        if (user == null)
            return new Result();
        String fileMd5 = DigestUtils.md5DigestAsHex(file.getBytes());
        String filename = user.getUsername() + new Date().toString() + fileMd5;

        //文件已存在
        if(userFileService.checkExist(fileMd5)){
            String oldUrl = userFileService.getFileName(fileMd5);
            userService.updateUserHead(user.getUsername(), oldUrl);
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("url", oldUrl);
            return new Result(StateAndMessage.SUCCESS,StateAndMessage.UPLOADSUCCESS,data);
        }
        String path = session.getServletContext().getRealPath("/headImgs")+filename;
        // 文件名 username + datetime + filename
        File newFile = new File(path);
        logger.info("文件已保存至： "+path);
        userService.updateUserHead(user.getUsername(), path);
        file.transferTo(newFile);
        Map<String, Object> data = new HashMap<>();
        data.put("url", filename);
        return new Result(StateAndMessage.SUCCESS,null,data);
    }

    /**
     * 用户注销
     * @param session
     * @return
     */
    @RequestMapping("/user/quit")
    @ResponseBody
    public Object quit(HttpSession session){
        Object username = session.getAttribute(WebKeys.username);
        if(username == null)
            return new Result(StateAndMessage.FAIL,null,null);
        session.invalidate();
        return new Result(StateAndMessage.SUCCESS, null, null);
    }
}
