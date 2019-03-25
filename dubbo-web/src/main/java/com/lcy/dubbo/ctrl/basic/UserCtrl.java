package com.lcy.dubbo.ctrl.basic;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lcy.dubbo.service.BasicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author lcy
 * @Date 2019-01-08 16:54
 */
@RestController
public class UserCtrl {

    @Reference(version = "1.0.0")
    private BasicService basicService;

    @GetMapping(value = "/login.do")
    public HashMap<String,Object> login(String usercode,String password){
        HashMap<String,Object> param = new HashMap<>();
        param.put("code",200);
        param.put("msg","登录成功");
        return param;
    }


}
