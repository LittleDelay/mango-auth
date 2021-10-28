package com.mango.auth.service.impl;

import com.mango.auth.domain.model.SecurityUser;
import com.mango.auth.domain.model.User;
import com.mango.auth.service.MyUserService;
import com.mango.auth.service.UserService;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/21 10:14
 */
@Service
public class MyUserServiceImpl implements UserDetailsService, MyUserService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUserName(username);
        String name = user.getName();
        String password = user.getPassword();
        String authority = user.getAccount();
        return new SecurityUser(name, password, AuthorityUtils.commaSeparatedStringToAuthorityList(authority));
    }
}
