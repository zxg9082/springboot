package com.it.springboot.service;

import com.it.springboot.pojo.User;

public interface UserService {
    public User selectUserById(Integer id);
}
