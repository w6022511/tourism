package org.eking.tourism.common.common;

public enum ErrorCode {

    SUCCESS("E_000", "操作成功"),
    ERROR("E_999", "操作失败"),
    ERROR_LOGIN_USER_INFO("E_001", "用户名密码错误"),
    ERROR_LOGIN_USER_PASS_EXPIRED("E_002", "用户密码过期"),
    ERROR_LOGIN_USER_VERIFY_CODE("E_003", "验证码错误"),
    ERROR_LOGIN_USER_VERIFY_CODE_TIME_OUT("E_004", "验证码过期"),
    ERROR_LOGIN_USER_TOKEN_TIME_OUT("E_005", "TOKEN过期"),
    ERROR_GLOBAL_UNAUTHORITION("E_011", "没有操作权限"),
    ERROR_GLOBAL_PARAM_ERROR("E_012", "参数输入错误"),
    ERROR_GLOBAL_SERVER_ERROR("E_013", "服务器异常"),
    ERROR_GLOBAL_REMOTE_SERVICE_ERROR("E_014", "远程接口调用错误"),
    ERROR_ORG_DISABLE("E_041", "组织被禁用");

    private String code;
    private String message;

    private ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
