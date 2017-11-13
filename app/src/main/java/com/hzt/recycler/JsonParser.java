package com.hzt.recycler;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;


public class JsonParser {


    /**
     * 普通json解析成对象
     *
     * @param json
     * @param valueType
     * @return
     */
    public static <T> T parserJson(String json, Class<T> valueType) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        json = json.replaceAll("\"data\":false", "\"data\":null");
        T obj = null;
        try {
            obj = gson.fromJson(json, valueType);
        } catch (Exception e) {
            Log.i("JSON 解析错误!", "exception:" + e.getMessage() + "");
            return null;
        }
        return obj;
    }


    public static <T> T parserJson(String json, Type valueType) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        T obj = null;
        try {
            obj = gson.fromJson(json, valueType);
        } catch (Exception e) {
            Log.i("JSON 解析错误!", "exception:" + e.getMessage() + "");
            return null;
        }
        return obj;
    }


    /**
     * 将对象转换成json
     *
     * @param object
     * @return
     */
    public static String createJson(Object object) {
        String json = "";
        Gson gson = new Gson();
        try {
            json = gson.toJson(object);
        } catch (Exception e) {
            Log.i("转换成JSON错误!", "exception:" + e.getMessage() + "");
            return null;
        }
        return json;
    }


}
