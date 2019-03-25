package com.lcy.dubbo.basic.Dao;

import com.lcy.dubbo.basic.model.RoleMenuMo;

import java.util.List;

/**
 * @Author lcy
 * @Date 2019-01-07 14:34
 */
public interface RoleMenuDao {

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
     * 根据角色id查找
     *
     * @param roleId
     * @return java.util.List<com.lcy.dubbo.basic.model.RoleMenuDao>
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    List<RoleMenuMo> getRoleMenuListByRoleId(String roleId);

    /**
     * 根据菜单id查找
     *
     * @param menuId
     * @return java.util.List<com.lcy.dubbo.basic.model.RoleMenuDao>
     * @author lcy
     * @date 2018/12/19 15:29
     **/
    List<RoleMenuMo> getRoleMenuListByMenuId(String menuId);
}
