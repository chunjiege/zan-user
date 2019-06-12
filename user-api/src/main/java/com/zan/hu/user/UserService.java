package com.zan.hu.user;

import com.zan.hu.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @Author hupeng
 * @Date 2019-06-03 10:26
 * @Description todo
 **/
@RequestMapping("/api/user")
public interface UserService {

    /**
     * 通过guid 查找用户信息
     *
     * @param guid
     * @return
     */
    @GetMapping("/{guid}")
    User selectByGuid(@PathVariable(value = "guid") String guid);
}
