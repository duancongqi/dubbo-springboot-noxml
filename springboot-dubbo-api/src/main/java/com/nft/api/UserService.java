package com.nft.api;

import com.nft.user.User;

import java.util.List;

/**
 * @接口名称：UserService
 * @作者: 段大神经
 * @创建时间: 2019/1/9 21:38
 * @说明:
 */

public interface UserService {
    List<User> findUser();
}
