package com.zan.hu.user.mapper;

import com.zan.hu.user.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import tk.mybatis.mapper.common.Mapper;

@CacheConfig(cacheNames = "user")
public interface UserMapper extends Mapper<User> {

    @Cacheable(key = "#p0")
    User selectByGuid(@Param("guid") String guid);
}