package com.example.daina.entity;

/**
 * http请求返回的最外层对象
 * @author: Daina
 * @description:
 * @date: Created in 16:57 2019/3/11
 */
public class Result<T> {
    /** 错误码 */
    private Integer status;

    /** 提示信息 */
    private String message;

    /** 具体内容 */
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
