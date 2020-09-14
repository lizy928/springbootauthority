package com.dliony.springbootauthority.model;

import lombok.Data;

/**
 * @author lzy
 * @date 2020/9/14
 */
@Data
public class LoginUser {

    private String username;

    private String password;

    private Integer rememberMe;

}
