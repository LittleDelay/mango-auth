package com.mango.auth.domain.param.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User请求参数对象
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/21 10:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqUser {

    private String account;

    private String description;

    private String password;

    private String name;

}
