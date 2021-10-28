package com.mango.auth.service.impl;

import com.mango.auth.dao.UserMapper;
import com.mango.auth.domain.param.req.ReqUser;
import com.mango.auth.domain.model.User;
import com.mango.auth.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserServiceImpl
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/21 10:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Object getAllUsers() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public User getUserByUserName(String username) {
        return userMapper.getUserByUserName(username);
    }

    @Override
    public Object save(ReqUser reqUser) {
        User user = new User();
        BeanUtils.copyProperties(reqUser, user);
        int count = userMapper.insert(user);
        return count;
    }

}
