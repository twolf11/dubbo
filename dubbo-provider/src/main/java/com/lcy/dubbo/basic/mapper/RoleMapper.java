package com.lcy.dubbo.basic.mapper;

import com.lcy.dubbo.basic.model.RoleMo;

public interface RoleMapper {
    /**
     * 根据id查找角色信息
     *
     * @param roleId
     * @return com.lcy.dubbo.basic.model.RoleMo
     * @author lcy
     * @date 2018/12/19 15:31
     **/
    RoleMo getRoleById(String roleId);

    /**
     * 根据id删除角色信息
     *
     * @param roleId
     * @return int
     * @author lcy
     * @date 2018/12/19 15:31
     **/
    int delRoleById(String roleId);

    /**
     * 添加角色信息
     *
     * @param roleMo
     * @return int
     * @author lcy
     * @date 2018/12/19 15:31
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
}