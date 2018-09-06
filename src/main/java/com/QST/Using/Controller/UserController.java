package com.QST.Using.Controller;

import com.QST.Using.Etitys.User;
import com.QST.Using.Util.Result;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.VerifiCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller(value = "userController")
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/verifiCode")
    public @ResponseBody Result getVerifiCode(@RequestBody User user, HttpSession session){
        String sid = "75a45e2aede387ce3560d937f2f38bb1";
        String token = "ffe236f976ba5a8bae0c40b6cca39d4a";
        String appid = "bea1d8da1ca848b2949c4c712f7839f5";
        String templateid = "371640";
        String param = "";
        String mobile = "18797531598";
        String uid = "";
        if(!user.getUsername().isEmpty()){
            param =  String.valueOf(new Random().nextInt(899999) + 100000);
            String result=VerifiCode.InstantiationRestAPI().sendSms(sid,token,appid,templateid,param,mobile,uid);

        }
        return null;
    }
    @RequestMapping("/register")
    public @ResponseBody Result register(@RequestBody User user){

        return null;
    }
}
