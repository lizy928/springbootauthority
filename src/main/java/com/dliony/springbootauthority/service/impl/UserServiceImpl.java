package com.dliony.springbootauthority.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dliony.springbootauthority.entity.User;
import com.dliony.springbootauthority.mapper.UserMapper;
import com.dliony.springbootauthority.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author lzy
 * @date 2020/9/14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
