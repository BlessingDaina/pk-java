package com.example.daina.controller;

import com.example.daina.annotation.UserLoginToken;
import com.example.daina.entity.Menu;
import com.example.daina.entity.Result;
import com.example.daina.service.MenuService;
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
 * @date: Created in 15:16 2019/3/14
 */
@RestController
@RequestMapping(value = "/api")
public class MenuController {
    @Autowired
    MenuService menuService;

    @UserLoginToken
    @RequestMapping(value = "/getMenus", method = RequestMethod.POST)
    public Result getMenus(@RequestParam("siteId")String siteId) {
        List<Menu> menus = menuService.getMenuParentBySiteId(siteId);
        return ResultUtil.success(menus);
    }
}
