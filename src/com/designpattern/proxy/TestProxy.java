package com.designpattern.proxy;

/**
 * Created by lenovo on 2017/11/22.
 * JDK动态代理实现
 */
public class TestProxy {
    public static void main(String[] args) {
        //实例化目标
        UserService userService = new UserServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
        //根据目标对象生成代理
        UserService proxy =(UserService) myInvocationHandler.getProxy();
        proxy.add();
    }
}
