package com.example.daina.controller;

import com.example.daina.entity.Result;
import com.example.daina.entity.User;
import com.example.daina.service.TokenService;
import com.example.daina.service.UserService;
import com.example.daina.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Daina
 * @description:
 * @date: Created in 17:01 2019/3/11
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    TokenService tokenService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(User user) {
        Map<String, Object> map = userService.login(user);
        String userId = (String)map.get("userId");
        String tag = "";
        if (userId != tag) {
            User tokenInfo = userService.findUserByLoginName(user.getLoginName());
            String token = tokenService.getToken(tokenInfo);
            map.put("token", token);
            return ResultUtil.success(map);
        } else {
            return ResultUtil.error(500, "该用户不存在");
        }
    }
}
