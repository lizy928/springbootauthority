package com.dliony.springbootauthority.controller;

import com.dliony.springbootauthority.entity.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @date 2020/9/14
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/testToken")
    public Object test(){
        User user = new User();
        user.setId(1);
        user.setUsername("test");
        return user;
    }

    /**
     * 权限验证
     * @return
     */
    @DeleteMapping("delete")
    @PreAuthorize("hasRole('ADMIN')")
    public Object delete(){
        return "success";
    }
}
