package com.mango.auth.dao;

import com.mango.auth.domain.model.Role;
import com.mango.auth.utils.tkmybatis.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends BaseMapper<Role> {
}