package com.lcy.dubbo.basic.Dao.impl;

import com.lcy.dubbo.basic.Dao.RoleMenuDao;
import com.lcy.dubbo.basic.mapper.RoleMenuMapper;
import com.lcy.dubbo.basic.model.RoleMenuMo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lcy
 * @Date 2019-01-07 15:53
 */
@Service
public class RoleMenuDaoImpl implements RoleMenuDao {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public int delRoleMenuById(String id) {
        return roleMenuMapper.delRoleMenuById(id);
    }

    @Override
    public int addRoleMenu(RoleMenuMo roleMenuMo) {
        return roleMenuMapper.addRoleMenu(roleMenuMo);
    }

    @Override
    public RoleMenuMo getRoleMenuById(String id) {
        return roleMenuMapper.getRoleMenuById(id);
    }

    @Override
    public List<RoleMenuMo> getRoleMenuListByRoleId(String roleId) {
        return roleMenuMapper.getRoleMenuListByRoleId(roleId);
    }

    @Override
    public List<RoleMenuMo> getRoleMenuListByMenuId(String MenuId) {
        return roleMenuMapper.getRoleMenuListByMenuId(MenuId);
    }
}
