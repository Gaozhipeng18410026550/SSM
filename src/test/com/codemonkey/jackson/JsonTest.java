package com.codemonkey.jackson;

import com.codemonkey.utils.JsonUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: json测试类
 * User: gaozhipen
 * Date: 2017-05-08
 * Time: 11:12
 */
public class JsonTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonTest.class);

    @Test
    public void map2Json() {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "zhang");
        map1.put(2, "wang");
        String jsonStr1 = JsonUtils.toJson(map1);
        LOGGER.info("map转json成功：" + jsonStr1);
    }

    @Test
    public void json2Map() {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "zhang");
        map1.put(2, "wang");
        String jsonStr1 = JsonUtils.toJson(map1);

        Map<Integer, String> result = JsonUtils.fromJsonAsMap(jsonStr1, Integer.class, String.class);
        LOGGER.info("json --> map：" + result.get(1));
    }

    @Test
    public void json2List() {
        String jsonStr = "[{\"1\":\"zhang\", \"2\":\"wang\"},{ \"3\":\"zhang\", \"4\":\"wang\"}]";
        List<String> list = JsonUtils.fromJsonAsList(jsonStr,String.class);
    }
}
