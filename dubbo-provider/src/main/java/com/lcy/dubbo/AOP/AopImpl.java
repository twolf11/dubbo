package com.lcy.dubbo.AOP;

public class AopImpl implements  AopInterfacce {
    @Override
    public String writer() {
        System.out.println("切点");
        return "write";
    }
}
