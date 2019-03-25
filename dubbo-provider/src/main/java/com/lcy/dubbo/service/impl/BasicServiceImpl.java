/**
 *
 */
package com.lcy.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lcy.dubbo.basic.Dao.*;
import com.lcy.dubbo.basic.model.*;
import com.lcy.dubbo.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * dubbo提供者接口实现类
 * @author lcy
 * @date 2018年10月17日下午2:37:27
 *
 */
@Service(version = "1.0.0")
public class BasicServiceImpl implements BasicService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private MenuDao menuDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserRoleDao userRoleDao;
    @Autowired
    private RoleMenuDao roleMenuDao;


    @Override
    public int delUserById(String userId) {
        return userDao.delUserById(userId);
    }

    @Override
    public int addUser(UserMo userMo) {
        return userDao.addUser(userMo);
    }

    @Override
    public UserMo getUserById(String userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public int updateUserById(UserMo userMo) {
        return userDao.updateUserById(userMo);
    }

    @Override
    public MenuMo getMenuById(String menuId) {
        return menuDao.getMenuById(menuId);
    }

    @Override
    public int delMenuById(String menuId) {
        return menuDao.delMenuById(menuId);
    }

    @Override
    public int addMenu(MenuMo menuMo) {
        return menuDao.addMenu(menuMo);
    }

    @Override
    public int updateMenuById(MenuMo menuMo) {
        return menuDao.updateMenuById(menuMo);
    }

    @Override
    public RoleMo getRoleById(String roleId) {
        return roleDao.getRoleById(roleId);
    }

    @Override
    public int delRoleById(String roleId) {
        return roleDao.delRoleById(roleId);
    }

    @Override
    public int addRole(RoleMo roleMo) {
        return roleDao.addRole(roleMo);
    }

    @Override
    public int updateRoleById(RoleMo roleMo) {
        return roleDao.updateRoleById(roleMo);
    }

    @Override
    public int delRoleMenuById(String id) {
        return roleMenuDao.delRoleMenuById(id);
    }

    @Override
    public int addRoleMenu(RoleMenuMo roleMenuMo) {
        return roleMenuDao.addRoleMenu(roleMenuMo);
    }

    @Override
    public RoleMenuMo getRoleMenuById(String id) {
        return roleMenuDao.getRoleMenuById(id);
    }

    @Override
    public List<RoleMenuMo> getRoleMenuListByRoleId(String roleId) {
        return roleMenuDao.getRoleMenuListByRoleId(roleId);
    }

    @Override
    public int delUserRoleById(String id) {
        return userRoleDao.delUserRoleById(id);
    }

    @Override
    public int addUserRole(UserRoleMo userRoleMo) {
        return userRoleDao.addUserRole(userRoleMo);
    }

    @Override
    public UserRoleMo getUserRoleById(String id) {
        return userRoleDao.getUserRoleById(id);
    }

    @Override
    public UserRoleMo getUserRoleByUserId(String userId) {
        return userRoleDao.getUserRoleByUserId(userId);
    }

    @Override
    public List<UserRoleMo> getUserRoleListByRoleId(String roleId) {
        return userRoleDao.getUserRoleListByRoleId(roleId);
    }


}
