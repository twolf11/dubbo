/**
 *
 */
package com.lcy.dubbo.basic.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户类
 *
 * @author lcy
 * @date 2018年10月23日上午11:04:50
 *
 */
@Data
public class UserMo implements Serializable {

    private static final long serialVersionUID = 124466789832L;

    //用户id
    private String userId;
    //账号（登录名）
    private String usercode;
    //用户昵称
    private String username;
    //密码
    private String password;
    //性别（1、男  2、女）
    private int sex;
    //年龄
    private int age;
    //是否冻结（0、否  1、冻结）
    private int disable;
    //手机号码
    private String mobile;
    //电子邮箱
    private String email;
    //登录次数
    private int loginCount;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;
    //最后修改用户信息时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date utime;
    //最后一次登录登录时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    public UserMo() {
    }

    public UserMo(String userId, String usercode, String username, String password, int sex, int age, int disable, String mobile, String email, int loginCount, Date ctime, Date utime, Date lastLoginTime) {
        this.userId = userId;
        this.usercode = usercode;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.disable = disable;
        this.mobile = mobile;
        this.email = email;
        this.loginCount = loginCount;
        this.ctime = ctime;
        this.utime = utime;
        this.lastLoginTime = lastLoginTime;
    }
}
