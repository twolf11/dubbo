package com.lcy.dubbo.cache;

public class RedisKey {

    //用户信息  by userId
    public final static String USER_MSG_ID_KEY = "USER_MSG_ID_KEY";

    //用户信息 by usercode
    public final static String USER_MSG_CODE_KEY = "USER_MSG_CODE_KEY";

    //菜单信息  by menuId
    public final static String MENU_MSG_ID_KEY = "MENU_MSG_ID_KEY";

    //角色信息  by roleId
    public final static String ROLE_MSG_ID_KEY = "ROLE_MSG_ID_KEY";

    //角色对应菜单信息  by  id
//    public final static String ROLE_MENU_ID_KEY = "ROLE_MENU_ID_KEY";

    //角色对应菜单信息  by  roleId
    public final static String ROLE_MENU_RID_KEY = "ROLE_MENU_RID_KEY";

    //用户对应角色信息  by id
//    public final static String USER_ROLE_ID_KEY = "USER_ROLE_ID_KEY";

    //用户对应角色信息  by userId
    public final static String USER_ROLE_UID_KEY = "USER_ROLE_UID_KEY";

}
