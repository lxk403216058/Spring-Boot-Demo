package com.huazi.shiro.service;

import com.huazi.shiro.mapper.UserMapper;
import com.huazi.shiro.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(String name) {
        return userMapper.queryById(name);
    }
}
