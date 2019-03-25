package com.lcy.dubbo.basic.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class RoleMo implements Serializable {

    private static final long serialVersionUID = 123523521652L;

    //角色id
    private String roleId;
    //角色名称
    private String roleName;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;

    public RoleMo() {
    }

    public RoleMo(String roleId, String roleName, Date ctime) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.ctime = ctime;
    }
}
