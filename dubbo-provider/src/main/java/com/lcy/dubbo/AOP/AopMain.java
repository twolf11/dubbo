package com.lcy.dubbo.AOP;

import org.springframework.cglib.proxy.Proxy;

public class AopMain {

    public static void main(String[] args) {
        AopImpl sayHelloWorld = new AopImpl();
        AOPHandle handle = new AOPHandle(sayHelloWorld);
        AopInterfacce i = (AopInterfacce) Proxy.newProxyInstance(AopInterfacce.class.getClassLoader(), new Class[] { AopInterfacce.class }, handle);
        i.writer();
    }
}
