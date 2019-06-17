package com.zan.hu.user.service;

import com.zan.hu.CommonThreadLocal;
import com.zan.hu.CurrentRelatedInfo;
import com.zan.hu.user.UserService;
import com.zan.hu.user.dao.UserDao;
import com.zan.hu.user.feign.FileClient;
import com.zan.hu.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

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

    @Autowired
    private FileClient fileClient;

    @Override
    public User selectByGuid(String guid) {
        CurrentRelatedInfo currentRelatedInfo = CommonThreadLocal.get();
        if (currentRelatedInfo != null) {
            User user = currentRelatedInfo.getUser();
            System.out.println(user);
        }
        return userDao.selectByGuid(guid);
    }

    @Override
    public String upload(MultipartFile multipartFile) {
        return fileClient.singleUpload(multipartFile);
    }

    @Override
    public List<String> multiUpload(MultipartFile[] multipartFile) {
        return fileClient.multiUpload(multipartFile);
    }
}
