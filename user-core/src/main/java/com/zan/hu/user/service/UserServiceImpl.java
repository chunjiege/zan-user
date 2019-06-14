package com.zan.hu.user.service;

import com.zan.hu.CommonThreadLocal;
import com.zan.hu.CurrentRelatedInfo;
import com.zan.hu.user.UserService;
import com.zan.hu.user.dao.UserDao;
import com.zan.hu.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
        CurrentRelatedInfo currentRelatedInfo = CommonThreadLocal.get();
        if (currentRelatedInfo != null) {
            User user = currentRelatedInfo.getUser();
            System.out.println(user);
        }
        return userDao.selectByGuid(guid);
    }
}
