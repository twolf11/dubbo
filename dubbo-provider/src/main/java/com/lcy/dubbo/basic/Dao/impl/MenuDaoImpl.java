package com.lcy.dubbo.basic.Dao.impl;

import com.lcy.dubbo.basic.Dao.MenuDao;
import com.lcy.dubbo.basic.mapper.MenuMapper;
import com.lcy.dubbo.basic.model.MenuMo;
import com.lcy.dubbo.cache.RedisKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MenuDaoImpl implements MenuDao {

    @Autowired
    private MenuMapper menuMapper;

    @Cacheable(value = RedisKey.MENU_MSG_ID_KEY, key = "#menuId")
    @Override
    public MenuMo getMenuById(String menuId) {
        return menuMapper.getMenuById(menuId);
    }

    @CacheEvict(value = RedisKey.MENU_MSG_ID_KEY, key = "#menuId")
    @Override
    public int delMenuById(String menuId) {
        return menuMapper.delMenuById(menuId);
    }

    @CachePut(value = RedisKey.MENU_MSG_ID_KEY, key = "#menuMo.menuId")
    @Override
    public int addMenu(MenuMo menuMo) {
        return menuMapper.addMenu(menuMo);
    }

    @CachePut(value = RedisKey.MENU_MSG_ID_KEY, key = "#menuMo.menuId")
    @Override
    public int updateMenuById(MenuMo menuMo) {
        return menuMapper.updateMenuById(menuMo);
    }
}
