package com.codemonkey.spring;

import com.codemonkey.user.entry.User;
import com.codemonkey.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description: 用户服务测试类
 * User: gaozhipen
 * Date: 2017-05-05
 * Time: 17:17
 */

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 * 告诉junit spring配置文件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
        User user  = userService.getUser(1);
    }
}
