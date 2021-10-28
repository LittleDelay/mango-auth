package com.mango.auth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/21 10:59
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.mango.auth.dao"})
public class MangoAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoAuthApplication.class, args);
    }

}
