package com.mango.auth.service;

import com.mango.auth.domain.param.req.ReqUser;
import com.mango.auth.domain.model.User;

/**
 * UserService接口
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/21 10:17
 */
public interface UserService {

    Object getAllUsers();

    User getUserByUserName(String username);

    Object save(ReqUser reqUser);

}
