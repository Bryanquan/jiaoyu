package com.util;
import com.google.gson.Gson;
/**
 * json工具类
 * @author bryan quan
 */
public class JsonUtil {
    public static String jsonCovert(Object object)
    {
        Gson gson =new Gson();
        return gson.toJson(object);
    }

}
