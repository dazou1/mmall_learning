package com.mmall.common;

/**
 * @Author: dazou
 * @Description:
 * @Date: Create in 23:08 2018/11/6
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    //通过内部接口类，把常量进行分组，没有枚举那么重量级，但是又起到了分组的作用，在里面定义常量
    public interface Role {
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1; //管理员
    }
}
