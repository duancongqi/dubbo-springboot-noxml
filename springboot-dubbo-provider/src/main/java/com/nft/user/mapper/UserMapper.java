package com.nft.user.mapper;

import com.nft.user.pojo.User;

import java.util.List;

/**
 * @接口名称：UserMapper
 * @作者: 段大神经
 * @创建时间: 2019/1/9 22:27
 * @说明:
 */
public interface UserMapper {
    List<User> findUser();
}
