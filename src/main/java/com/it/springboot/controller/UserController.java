package com.it.springboot.controller;

import com.it.springboot.pojo.User;
import com.it.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User selectUserById(@PathVariable Integer id) {
        return userService.selectUserById(id);
    }
}
