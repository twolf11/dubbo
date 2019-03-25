package com.lcy.dubbo.basic.Dao.impl;

import com.lcy.dubbo.basic.Dao.UserRoleDao;
import com.lcy.dubbo.basic.mapper.UserRoleMapper;
import com.lcy.dubbo.basic.model.UserRoleMo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lcy
 * @Date 2019-01-07 15:55
 */
@Service
public class UserRoleDaoImpl implements UserRoleDao {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int delUserRoleById(String id) {
        return userRoleMapper.delUserRoleById(id);
    }

    @Override
    public int addUserRole(UserRoleMo userRoleMo) {
        return userRoleMapper.addUserRole(userRoleMo);
    }

    public UserRoleMo getUserRoleById(String id) {
        return userRoleMapper.getUserRoleById(id);
    }

    @Override
    public UserRoleMo getUserRoleByUserId(String userId) {
        return userRoleMapper.getUserRoleByUserId(userId);
    }

    @Override
    public List<UserRoleMo> getUserRoleListByRoleId(String roleId) {
        return userRoleMapper.getUserRoleListByRoleId(roleId);
    }
}
