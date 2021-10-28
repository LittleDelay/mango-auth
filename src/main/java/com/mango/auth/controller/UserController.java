package com.mango.auth.controller;

import com.mango.auth.domain.param.req.ReqUser;
import com.mango.auth.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User资源服务器 UserController
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/21 10:36
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 得到所有用户列表，所有权限可以访问
     * @return Object
     */
    @PostMapping("/users")
    public Object getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * 增加用户，只有权限为admin的用户才可以访问
     */
    @PostMapping("/save")
    public Object save(@RequestBody ReqUser reqUser) {
        return userService.save(reqUser);
    }

}
