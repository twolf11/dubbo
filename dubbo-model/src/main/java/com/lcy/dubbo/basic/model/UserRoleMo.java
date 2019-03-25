package com.lcy.dubbo.basic.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description TODO
 * @Author lcy
 * @Date 2019-01-7 10:57
 */
@Data
public class UserRoleMo implements Serializable {

    private static final long serialVersionUID = 780912312346L;

    //id
    private String id;
    //用户id
    private String userId;
    //角色id
    private String roleId;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;

    public UserRoleMo() {
    }

    public UserRoleMo(String id, String userId, String roleId, Date ctime) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
        this.ctime = ctime;
    }
}
