package com.codemonkey.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: 测试slf4j+logback
 * User: gaozhipen
 * Date: 2017-05-05
 * Time: 14:51
 */
public class BlogAction {

    //定义一个全局的记录器，通过LoggerFactory获取
    private static final Logger LOGGER = LoggerFactory.getLogger(BlogAction.class);

    @Test
    public void testLogback(){
        LOGGER.info("logback 配置成功");
        LOGGER.error("logback 配置成功");
    }
}
