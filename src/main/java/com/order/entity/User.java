package com.order.entity;


import lombok.Data;

@Data
public class User {
    private Integer id;   //账号
    private String name;   //用户名
    private String phone;   //手机号
    private String address;   //地址
    private String password;   //密码
}
