package com.QST.Using.Controller;

import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.CodeResult;
import com.QST.Using.Util.VerifiCode.ucpaas.restDemo.VerifiCode;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class UserControllerTest {
    @Test
    public void getVerifiCode(){
//        String sid = "75a45e2aede387ce3560d937f2f38bb1";
//        String token = "ffe236f976ba5a8bae0c40b6cca39d4a";
//        String appid = "bea1d8da1ca848b2949c4c712f7839f5";
//        String templateid = "371640";
//        String param = "";
//        String mobile = "18797531598";
//        String uid = "";
//
//        param =  String.valueOf(new Random().nextInt(899999) + 100000);
//        String result= VerifiCode.InstantiationRestAPI().sendSms(sid,token,appid,templateid,param,mobile,uid);
//        System.out.println(result);
        String result="{\"code\":\"000000\",\"count\":\"1\",\"create_date\":\"2018-09-07 10:04:10\",\"mobile\":\"18797531598\",\"msg\":\"OK\",\"smsid\":\"3da35415067a04b377a02ed4e58c60ef\",\"uid\":\"\"}";
        JSONObject jsonObject=JSONObject.fromObject(result);
        CodeResult codeResult =(CodeResult)JSONObject.toBean(jsonObject, CodeResult.class);
        System.out.println(codeResult.getCode());

    }
}git