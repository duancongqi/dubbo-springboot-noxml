package com.nft;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @类名称：ProApp
 * @作者: 段大神经
 * @创建时间: 2019/1/9 21:41
 * @说明:
 */
@EnableDubboConfiguration
@SpringBootApplication
@MapperScan("com.nft.*.mapper")
public class ProApp {
    public static void main(String[] args) {
        SpringApplication.run(ProApp.class);
    }
}
