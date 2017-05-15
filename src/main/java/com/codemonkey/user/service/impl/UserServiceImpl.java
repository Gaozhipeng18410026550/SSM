package com.codemonkey.user.service.impl;

import com.codemonkey.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Description: 用户服务接口实现
 * User: gaozhipen
 * Date: 2017-05-05
 * Time: 17:19
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public void users() {
        LOGGER.info("user server test success");
    }


}
