package com.lcy.dubbo.basic.mapper;

import com.lcy.dubbo.basic.model.UserMo;

public interface UserMapper {
    /**
     * 根据id删除用户信息
     *
     * @param userId
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int delUserById(String userId);


    /**
     * 添加用户
     *
     * @param userMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int addUser(UserMo userMo);

    /**
     * 根据id查找用户信息
     *
     * @param userId
     * @return com.lcy.dubbo.basic.model.UserMo
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    UserMo getUserById(String userId);

    /**
     * 根据usercode(登录账号)查找用户信息
     *
     * @param usercode
     * @return com.lcy.dubbo.basic.model.UserMo
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    UserMo getUserByUsercode(String usercode);

    /**
     * 根据id修改用户信息
     *
     * @param userMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int updateUserById(UserMo userMo);
}