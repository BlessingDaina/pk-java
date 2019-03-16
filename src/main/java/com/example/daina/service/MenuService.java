package com.example.daina.service;

import com.example.daina.entity.Menu;
import com.example.daina.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Daina
 * @description:
 * @date: Created in 14:14 2019/3/14
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenuParentBySiteId(String siteId) {
        return menuMapper.getMenuParentBySiteId(siteId);
    }
}
