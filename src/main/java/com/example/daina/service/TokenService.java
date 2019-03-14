package com.example.daina.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.daina.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author: Daina
 * @description:
 * @date: Created in 10:16 2019/3/14
 */
@Service
public class TokenService {
    public String getToken(User user) {
        System.out.println(user);
        String token="";
        token = JWT.create().withAudience(user.getUserId()).sign(Algorithm.HMAC256(user.getLoginPwd()));
        System.out.println(token);
        return token;
    }
}
