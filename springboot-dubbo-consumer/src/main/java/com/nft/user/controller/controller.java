package com.nft.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nft.api.UserService;
import com.nft.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名称：controller
 * @作者: 段大神经
 * @创建时间: 2019/1/9 23:22
 * @说明:
 */
@RestController
public class controller {
    @Reference
    private UserService userService;
    @GetMapping("findUser")
    public List<User> findUser(){
        return userService.findUser();
    }
}
