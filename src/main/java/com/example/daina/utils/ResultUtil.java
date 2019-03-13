package com.example.daina.utils;

import com.example.daina.entity.Result;

/**
 * @author: Daina
 * @description:
 * @date: Created in 16:57 2019/3/11
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setStatus(200);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer status, String message) {
        Result result = new Result();
        result.setStatus(status);
        result.setMessage(message);
        return result;
    }
}
