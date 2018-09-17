package com.example.using.util.Param;

import net.sf.json.JSONObject;

public class JsonToBean<T> {
    public T jsonToBean(String str,Class<T> clazz){

        JSONObject jsonObject=JSONObject.fromObject(str);
        T t = (T) JSONObject.toBean(jsonObject,clazz);
        return t;
    }
}
