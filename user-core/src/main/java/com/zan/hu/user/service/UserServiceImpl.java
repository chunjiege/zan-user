package com.zan.hu.user.service;

import com.zan.hu.CommonThreadLocal;
import com.zan.hu.user.UserService;
import com.zan.hu.user.dao.UserDao;
import com.zan.hu.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @version 1.0
 * @Author hupeng
 * @Date 2019-06-03 10:31
 * @Description todo
 **/
@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectByGuid(String guid) {
        if (!CollectionUtils.isEmpty(CommonThreadLocal.get())) {
            Map<String, Object> map = CommonThreadLocal.get();
            System.out.println(map.get("user"));
        }
        return userDao.selectByGuid(guid);
    }
}
