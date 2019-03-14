package com.example.daina.controller;

import com.example.daina.annotation.UserLoginToken;
import com.example.daina.entity.Result;
import com.example.daina.entity.Site;
import com.example.daina.service.SiteService;
import com.example.daina.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Daina
 * @description:
 * @date: Created in 14:36 2019/3/13
 */
@RestController
@RequestMapping("/api")
public class SiteController {

    @Autowired
    SiteService siteService;

    @UserLoginToken
    @RequestMapping(value = "/getSites", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public Result getSites(@RequestParam("userId")String userId) {
        List<Site> sites = siteService.getSites();
        if (userId != "") {
            return ResultUtil.success(sites);
        } else {
            return ResultUtil.error(500, "参数错误");
        }
    }
}
