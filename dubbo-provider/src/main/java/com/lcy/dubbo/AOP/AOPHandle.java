package com.lcy.dubbo.AOP;

import org.aopalliance.intercept.Joinpoint;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class AOPHandle implements InvocationHandler {

    private Object obj;
    AOPHandle(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        //方法返回值
        System.out.println("前置代理");
        //反射调用方法
        Object ret=method.invoke(obj, objects);
        //声明结束
        System.out.println("后置代理");
        //返回反射调用方法的返回值

        return ret;
    }
}
