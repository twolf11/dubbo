/**
 *
 */
package com.lcy.dubbo.service;


import com.lcy.dubbo.basic.model.*;

import java.util.List;

/**
 * @author lcy
 * @date 2018年10月17日下午2:25:59
 *
 */
public interface BasicService {
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
     * 根据id修改用户信息
     *
     * @param userMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int updateUserById(UserMo userMo);

    /**
     * 根据ID查询菜单详情
     *
     * @param menuId
     * @return com.lcy.dubbo.basic.model.MenuMo
     * @author lcy
     * @date 2018/12/19 15:30
     **/
    MenuMo getMenuById(String menuId);

    /**
     * 根据id删除菜单
     *
     * @param menuId
     * @return int
     * @author lcy
     * @date 2018/12/19 15:30
     **/
    int delMenuById(String menuId);

    /**
     * 添加菜单信息
     *
     * @param menuMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:30
     **/
    int addMenu(MenuMo menuMo);

    /**
     * 根据ID修改菜单信息
     *
     * @param menuMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:30
     **/
    int updateMenuById(MenuMo menuMo);

    /**
     * 根据id查找角色信息
     *
     * @param roleId
     * @return com.lcy.dubbo.basic.model.RoleMo
     * @author lcy
     * @date 2018/12/19 15:33
     **/
    RoleMo getRoleById(String roleId);

    /**
     * 根据id删除角色信息
     *
     * @param roleId
     * @return int
     * @author lcy
     * @date 2018/12/19 15:34
     **/
    int delRoleById(String roleId);

    /**
     * 添加角色信息
     *
     * @param roleMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:33
     **/
    int addRole(RoleMo roleMo);

    /**
     * 根据id修改角色信息
     *
     * @param roleMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:31
     **/
    int updateRoleById(RoleMo roleMo);

    /**
     * 根据id删除角色对应菜单信息
     *
     * @param id
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int delRoleMenuById(String id);


    /**
     * 添加用户对应角色
     *
     * @param roleMenuMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    int addRoleMenu(RoleMenuMo roleMenuMo);

    /**
     * 根绝id查找角色对应菜单信息
     *
     * @param id
     * @return com.lcy.dubbo.basic.model.RoleMenuMo
     * @author lcy
     * @date 2019/1/7 16:37
     **/
    RoleMenuMo getRoleMenuById(String id);

    /**
     * 根据角色id查找角色信息
     *
     * @param roleId
     * @return java.util.List<com.lcy.dubbo.basic.model.RoleMenuDao>
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    List<RoleMenuMo> getRoleMenuListByRoleId(String roleId);

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
