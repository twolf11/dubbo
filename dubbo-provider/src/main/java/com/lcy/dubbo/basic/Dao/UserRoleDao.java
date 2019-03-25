package com.lcy.dubbo.basic.Dao;

import com.lcy.dubbo.basic.model.UserRoleMo;

import java.util.List;

/**
 * @Author lcy
 * @Date 2019-01-07 14:33
 */
public interface UserRoleDao {

    /**
     * 根据id删除用户对应角色信息
     *
     * @param id
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int delUserRoleById(String id);

    /**
     * 添加用户对应角色
     *
     * @param userRoleMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int addUserRole(UserRoleMo userRoleMo);

    /**
     * 根据id查找用户对应角色信息
     *
     * @param id
     * @return com.lcy.dubbo.basic.model.UserRoleMo
     * @author lcy
     * @date 2019/1/7 16:56
     **/
    UserRoleMo getUserRoleById(String id);

    /**
     * 根据用户id获取角色信息
     *
     * @param userId
     * @return com.lcy.dubbo.basic.model.UserRoleMo
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    UserRoleMo getUserRoleByUserId(String userId);

    /**
     * 根据角色id获取该角色的所有用户信息
     *
     * @param roleId
     * @return java.util.List<com.lcy.dubbo.basic.model.UserRoleMo>
     * @author lcy
     * @date 2019/1/7 15:42
     **/
    List<UserRoleMo> getUserRoleListByRoleId(String roleId);
}
