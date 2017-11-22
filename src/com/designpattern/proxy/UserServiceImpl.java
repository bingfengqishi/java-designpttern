package com.designpattern.proxy;
/**
 * Created by lenovo on 2017/11/22.
 * 业务接口实现类
 */
public class UserServiceImpl implements  UserService{
    @Override
    public void add() {
        System.out.println("这是业务方法!");
    }
}
