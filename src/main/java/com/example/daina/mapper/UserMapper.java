package com.example.daina.mapper;

import com.example.daina.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: Daina
 * @description:
 * @date: Created in 17:02 2019/3/11
 */
@Repository
public interface UserMapper {

    User login(User user);
    User findUserByLoginName(@Param("loginName")String loginName);
    User findUserByUserId(@Param("userId")String userId);
}

