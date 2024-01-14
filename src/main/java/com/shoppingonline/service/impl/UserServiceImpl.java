package com.shoppingonline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
        QueryWrapper<User> qw = new QueryWrapper<>();
        return userMapper.selectOne(qw.eq("username",username));
    }

    @Override
    public void register(String username, String password) {
        String md5String = Md5Util.getMD5String(password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(md5String);
        userMapper.insert(user);
    }
}

