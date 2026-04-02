package com.jx.AIPlatform.constant;

public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    /**
     * 最短账号长度
     */
    int MIN_ACCOUNT_LENGTH = 4;

    /**
     * 最短密码长度
     */
    int MIN_PASSWORD_LENGTH = 8;

    // endregion
}

