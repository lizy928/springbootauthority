package com.dliony.springbootauthority.controller;

import com.dliony.springbootauthority.entity.User;
import com.dliony.springbootauthority.model.ResponseModel;
import com.dliony.springbootauthority.service.IUserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author lzy
 * @date 2020/9/14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService iUserService;

    @Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/register")
    public Object register(@RequestBody Map<String, String> registerUser) {
        User user = new User();
        user.setUsername(registerUser.get("username"));
        user.setPassword(bCryptPasswordEncoder.encode(registerUser.get("password")));
        user.setRole("ROLE_USER");
        iUserService.save(user);
        return "success";
    }

    /**
     * 获取权限信息
     * @return
     */
    @GetMapping("/authInfo")
    public Object authInfo(){



        return new ResponseModel();
    }

//    @PostMapping("/login")
//    public Object login(LoginUser loginUser){
//
//        return "success";
//    }
}
