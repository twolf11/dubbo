package com.lcy.dubbo.basic.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description TODO
 * @Author lcy
 * @Date 2019-01-07 11:46
 */
@Data
public class RoleMenuMo implements Serializable {

    private static final long serialVersionUID = 780912312346L;

    //id
    private String id;
    //角色id
    private String roleId;
    //菜单id
    private String menuId;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;

    public RoleMenuMo() {
    }

    public RoleMenuMo(String id, String roleId, String menuId, Date ctime) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
        this.ctime = ctime;
    }
}
