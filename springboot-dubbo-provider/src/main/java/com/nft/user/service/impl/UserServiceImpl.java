package com.nft.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nft.api.UserService;
import com.nft.user.mapper.UserMapper;
import com.nft.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @类名称：UserServiceImpl
 * @作者: 段大神经
 * @创建时间: 2019/1/9 22:11
 * @说明:
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }
}
