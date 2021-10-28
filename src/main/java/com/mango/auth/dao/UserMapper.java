package com.mango.auth.dao;

import com.mango.auth.domain.model.User;
import com.mango.auth.utils.tkmybatis.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

    User getUserByUserName(String userName);

}