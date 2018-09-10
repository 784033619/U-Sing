package com.QST.Using.Util.Param;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class MapToJsonstr {
    public static String mapToJsonstr(Map map){
        String str = null;
        ObjectMapper json = new ObjectMapper();
        try {
            str = json.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
