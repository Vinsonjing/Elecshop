package com.vjsoft.business.common;

public enum ResponseCode {
    USERNAME_NOT_EMPTY(1,"用户名不能为空"),
    PASSWORD_NOT_EMPTY(2,"密码不能为空"),
    USERNAME_NOT_EXIST(3,"用户不存在"),
    USERNAME_EXIST(4,"用户已存在"),
    PASSWORD_ERROR(5,"密码错误"),
    PARAMETER_NOT_EMPTY(6,"参数不能为空"),
    EMAIL_NOT_EMPTY(7,"邮箱不能为空"),
    QUESTION_NOT_EMPTY(8,"问题不能为空"),
    ANSWER_NOT_EMPTY(9,"答案不能为空"),
    PHONE_NOT_EMPTY(10,"电话不能为空"),
    EMAIL_EXIST(11,"邮箱已存在"),
    REGISTER_FAIL(12,"注册失败")
    ;


    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
