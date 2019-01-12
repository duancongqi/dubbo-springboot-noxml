package com.nft;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @类名称：ConApp
 * @作者: 段大神经
 * @创建时间: 2019/1/9 23:16
 * @说明:
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ConApp {
    public static void main(String[] args) {
        SpringApplication.run(ConApp.class,args);
    }
}
