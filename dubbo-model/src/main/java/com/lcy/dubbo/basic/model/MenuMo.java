package com.lcy.dubbo.basic.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class MenuMo implements Serializable {

    private static final long serialVersionUID = 124466789832L;

    //菜单id
    private String menuId;
    //菜单编码
    private String menuCode;
    //菜单名称
    private String menuName;
    //菜单级别
    private int level;
    //父菜单id
    private String parentMenuId;
    //父菜单名称
    private String parentMenuName;
    //url
    private String url;
    //标识
    private String target;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;
    //修改时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date utime;

    public MenuMo() {
    }

    public MenuMo(String menuId, String menuCode, String menuName, int level, String parentMenuId, String parentMenuName, String url, String target, Date ctime, Date utime) {
        this.menuId = menuId;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.level = level;
        this.parentMenuId = parentMenuId;
        this.parentMenuName = parentMenuName;
        this.url = url;
        this.target = target;
        this.ctime = ctime;
        this.utime = utime;
    }

}
