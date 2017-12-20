package com.designpattern.proxy;

/**
 * Created by lenovo on 2017/12/20.
 */
public class Source implements  Sourceable {
    @Override
    public void method() {
        System.out.println("the proxy demo test");
    }
}
