package com.mango.auth.controller;

import io.jsonwebtoken.Jwts;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * UserController  模拟资源服务器用的，用来访问资源的。
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/21 10:35
 */
@RestController
@RequestMapping("/user")
public class TestUserController {

    /**
     * 测试用的，不与数据库做连接
     *
     * @param authentication authentication
     * @param request request
     * @return Object
     */
    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication, HttpServletRequest request) {
        // Authorization是在请求头中的属性。
        String header = request.getHeader("Authorization");
        // bearer :jwt token,所以bearer加空格后的第七个才是token。
        String token = header.substring(header.lastIndexOf("bearer") + 7);
        return Jwts.parser()
                // 指定编码格式，要不然token有中文转换异常
                .setSigningKey("test_key".getBytes(StandardCharsets.UTF_8))
                .parseClaimsJws(token)
                .getBody();
    }

}
