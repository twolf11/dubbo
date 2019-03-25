package com.lcy.dubbo.ctrl.basic;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lcy.dubbo.service.BasicService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lcy
 * @Date 2019-01-08 16:54
 */
@RestController
public class MenuCtrl {

    @Reference(version = "1.0.0")
    private BasicService basicService;



}
