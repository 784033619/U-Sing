package com.example.using.util.VerifiCode.ucpaas.restDemo;

import net.sf.json.JSONObject;

public class CodeResult {
    private String code;
    private int count;
    private String craeat_date;
    private String mobile;
    private String msg;
    private String smsid;
    private String uid;

    public String getCode() {
        return code;
    }



    public void setCode(String code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCraeat_date() {
        return craeat_date;
    }

    public void setCraeat_date(String craeat_date) {
        this.craeat_date = craeat_date;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSmsid() {
        return smsid;
    }

    public void setSmsid(String smsid) {
        this.smsid = smsid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "CodeResult{" +
                "code='" + code + '\'' +
                ", count=" + count +
                ", craeat_date='" + craeat_date + '\'' +
                ", mobile='" + mobile + '\'' +
                ", msg='" + msg + '\'' +
                ", smsid='" + smsid + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }

    public static CodeResult getCodeResult(String result){
        JSONObject jsonObject=JSONObject.fromObject(result);
        CodeResult codeResult =(CodeResult)JSONObject.toBean(jsonObject, CodeResult.class);
        return codeResult;
    }
}
