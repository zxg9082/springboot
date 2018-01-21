package com.it.springboot.service.impl;

import com.it.springboot.mapper.UserMapper;
import com.it.springboot.pojo.User;
import com.it.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
