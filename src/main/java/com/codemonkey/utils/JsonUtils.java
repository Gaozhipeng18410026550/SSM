package com.codemonkey.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: Json工具类
 * User: gaozhipen
 * Date: 2017-05-08
 * Time: 9:50
 */
public class JsonUtils {

    /* 日志相关 */
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    /* 空字符串 */
    private static final String STRING_EMPTY = "";

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    }

    private JsonUtils() {

    }

    /**
     * 对象 --> json
     *
     * @param obj 对象
     * @return
     */
    public static String toJson(Object obj) {
        String result;
        try {
            result = OBJECT_MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return STRING_EMPTY;
        }
        return result;
    }

    /**
     * json --> 对象
     *
     * @param jsonStr json串
     * @param clazz   class类型
     * @param <T>     泛型
     * @return
     */
    public static <T> T fromJson(String jsonStr, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(jsonStr, clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * json --> map
     *
     * @param jsonStr    json串
     * @param keyClass   key的类型
     * @param valueClass value的类型
     * @param <K>        泛型key
     * @param <V>        泛型value
     * @return
     */
    public static <K, V> Map<K, V> fromJsonAsMap(String jsonStr, Class<K> keyClass, Class<V> valueClass) {
        JavaType type = OBJECT_MAPPER.getTypeFactory().constructMapType(Map.class, keyClass, valueClass);
        Map<K, V> map = new HashMap<K, V>();
        try {
            map = OBJECT_MAPPER.readValue(jsonStr, type);
        } catch (IOException e) {
            e.printStackTrace();
            return map;
        }
        return map;
    }

    /**
     * json --> list
     *
     * @param jsonStr json串
     * @param clazz   泛型类
     * @param <T>     泛型
     * @return
     */
    public static <T> List<T> fromJsonAsList(String jsonStr, Class<T> clazz) {
        JavaType type = OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, clazz);
        List<T> list = new ArrayList<T>();
        try {
            list = OBJECT_MAPPER.readValue(jsonStr, type);
        } catch (IOException e) {
            e.printStackTrace();
            return list;
        }
        return list;
    }

}
