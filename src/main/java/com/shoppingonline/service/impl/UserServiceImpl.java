package com.shoppingonline.service.impl;

import com.shoppingonline.mapper.UserMapper;
import com.shoppingonline.pojo.User;
import com.shoppingonline.service.UserService;
import com.shoppingonline.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }

    @Override
    public void register(String username, String password) {
        String md5String = Md5Util.getMD5String(password);
        userMapper.addUser(username, md5String);
    }
}

