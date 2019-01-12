package com.nft.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @类名称：User
 * @作者: 段大神经
 * @创建时间: 2019/1/9 21:39
 * @说明:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {
    private long userId;
    private String userName;
}
