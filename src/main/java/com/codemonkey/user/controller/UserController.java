package com.codemonkey.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: 用户管理控制类
 * User: gaozhipen
 * Date: 2017-05-27
 * Time: 16:22
 */
@Controller
@RequestMapping("/user")
public class UserController{

    @RequestMapping(value = "userList", method = RequestMethod.GET)
    public ModelAndView userList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/user/user_list");
        return mv;
    }
}
