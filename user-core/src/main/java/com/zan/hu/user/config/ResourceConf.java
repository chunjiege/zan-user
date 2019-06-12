package com.zan.hu.user.config;

import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Author hupeng
 * @Date 2019-04-09 10:48
 * @Description todo
 **/
@Configuration
//@EnableResourceServer
public class ResourceConf /*extends ResourceServerConf */ {

    private static final String RESOURCE_ID = "user-server";

    public String resourceId() {
        return RESOURCE_ID;
    }


}
