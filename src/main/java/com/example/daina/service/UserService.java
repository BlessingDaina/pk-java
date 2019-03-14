package com.example.daina.service;

import com.example.daina.entity.User;
import com.example.daina.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Daina
 * @description:
 * @date: Created in 17:03 2019/3/11
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Map<String, Object> login(User user) {
        User u = userMapper.login(user);
        Map<String, Object> map = new HashMap<>();
        System.out.println(u);
        if (u == null) {
            map.put("userId", "false");
        } else {
            map.put("userId", u.getUserId());
            map.put("unitId", u.getUnitId());
            map.put("isAdmin", u.getIsAdmin());
            map.put("userName", u.getUserName());
            map.put("phone", u.getPhone());
        }
        return map;
    }
    public User findUserByLoginName(String loginName) {
        return userMapper.findUserByLoginName(loginName);
    }
    public User findUserById(String userId) {
        return userMapper.findUserByUserId(userId);
    }
}
