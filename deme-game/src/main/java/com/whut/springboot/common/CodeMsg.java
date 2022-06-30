package com.whut.springboot.common;

public enum CodeMsg {

    SUCCESS(200, "操作成功"),
    ERROR(110, "操作失败"),
    AUTH_ERROR(400, "没有相应的权限！！！"),
    CODE_ERROR(440, "验证码错误"),
    CODE_INVALID(441, "验证码失效"),

    USER_USER_PASSWORD_ERROR(4001001, "用户名或者密码错误!"),

    USER_LOGIN_NAME_EXIST_ERROR(4001002, "用户登录名已被使用!"),
    USER_PHONE_EXIST_ERROR(4001003, "用户手机号已被使用!"),
    USER_ID_CARD_EXIST_ERROR(4001004, "用户身份证号已被使用!"),
    USER_NOT_HAVE_PERMISSION_ERROR(4001005, "用户权限不足!"),
    USER_UPDATE_PASSWORD_ERROR(4001006, "修改失败,原密码不正确"),
    DELETE_USER_ERROR(4002001,"删除用户信息信息失败");




    public Integer code; // 业务码
    public String msg; // 业务消息

    CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
