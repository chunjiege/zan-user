package com.zan.hu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @version 1.0
 * @Author hupeng
 * @Date 2019-05-25 16:17
 * @Description todo
 **/
@SpringCloudApplication
@ComponentScan("com.zan.hu")
@MapperScan("com.zan.hu.user.mapper")
@EnableCaching
@ServletComponentScan
@EnableFeignClients
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
