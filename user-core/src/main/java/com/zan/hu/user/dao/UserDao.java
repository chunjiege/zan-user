package com.zan.hu.user.dao;

import com.zan.hu.user.mapper.UserMapper;
import com.zan.hu.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author hupeng
 * @Date 2019-05-26 12:29
 * @Description todo
 **/
@Service
public class UserDao {

    @Autowired
    private UserMapper userMapper;


    public void insert() {
        User user = new User();
        userMapper.insert(user);
    }

    public User selectByGuid(String guid) {
        return userMapper.selectByGuid(guid);
    }
}
