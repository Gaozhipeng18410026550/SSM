package com.codemonkey.user.dao;

import com.codemonkey.user.entry.User;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * User: gaozhipen
 * Date: 2017-06-04
 * Time: 14:28
 */
@Repository
public interface UserDao {

    public void addUser(User user);

    public void deleteUser(int id);

    public User getUser(int id);
}
