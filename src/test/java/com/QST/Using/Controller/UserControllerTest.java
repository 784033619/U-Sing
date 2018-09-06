package com.QST.Using.Controller;

import com.QST.Using.Etitys.User;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.VerifiCode;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

import static org.junit.Assert.*;

public class UserControllerTest {
    @Test
    public void getVerifiCode(){
        String sid = "75a45e2aede387ce3560d937f2f38bb1";
        String token = "ffe236f976ba5a8bae0c40b6cca39d4a";
        String appid = "bea1d8da1ca848b2949c4c712f7839f5";
        String templateid = "371640";
        String param = "";
        String mobile = "18797531598";
        String uid = "";

        param =  String.valueOf(new Random().nextInt(899999) + 100000);
        String result=VerifiCode.InstantiationRestAPI().sendSms(sid,token,appid,templateid,param,mobile,uid);
        System.out.println("Response content is: " + result);
    }
}