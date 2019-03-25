package com.lcy.dubbo.basic.Dao.impl;

import com.lcy.dubbo.basic.Dao.RoleDao;
import com.lcy.dubbo.basic.mapper.RoleMapper;
import com.lcy.dubbo.basic.model.RoleMo;
import com.lcy.dubbo.cache.RedisKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private RoleMapper roleMapper;

    @Cacheable(value = RedisKey.ROLE_MSG_ID_KEY, key = "#roleId")
    @Override
    public RoleMo getRoleById(String roleId) {
        return roleMapper.getRoleById(roleId);
    }

    @CacheEvict(value = RedisKey.ROLE_MSG_ID_KEY, key = "#roleId")
    @Override
    public int delRoleById(String roleId) {
        return roleMapper.delRoleById(roleId);
    }

    @CachePut(value = RedisKey.ROLE_MSG_ID_KEY, key = "#roleMo.roleId")
    @Override
    public int addRole(RoleMo roleMo) {
        return roleMapper.addRole(roleMo);
    }

    @CachePut(value = RedisKey.ROLE_MSG_ID_KEY, key = "#roleMo.roleId")
    @Override
    public int updateRoleById(RoleMo roleMo) {
        return roleMapper.updateRoleById(roleMo);
    }
}
