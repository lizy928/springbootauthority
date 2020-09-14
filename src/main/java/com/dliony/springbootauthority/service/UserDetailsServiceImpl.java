package com.dliony.springbootauthority.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dliony.springbootauthority.entity.JwtUser;
import com.dliony.springbootauthority.entity.User;
import com.dliony.springbootauthority.mapper.UserMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lzy
 * @date 2020/9/14
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUsername, userName));
        return new JwtUser(user);
        /**
         * MyBatis-Plus will execute the following SQL
         *
         * SELECT * FROM user WHERE age >= 18
         */
//        List<User> userList = userMapper.selectList(
//                new QueryWrapper<User>()
//                        .lambda()
//                        .ge(User::getId, 18)
//        );
    }
}
