package com.codemonkey.user.service;

import com.codemonkey.user.entry.User;

/**
 * Description: 用户服务接口
 * User: gaozhipen
 * Date: 2017-05-05
 * Time: 17:15
 */
public interface UserService {

    public void addUser(User user);

    public void deleteUser(int id);

    public User getUser(int id);
}
