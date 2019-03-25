package com.lcy.dubbo.basic.mapper;

import com.lcy.dubbo.basic.model.MenuMo;

public interface MenuMapper {
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
}