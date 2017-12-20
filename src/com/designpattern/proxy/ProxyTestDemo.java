package com.designpattern.proxy;

/**
 * Created by lenovo on 2017/12/20.
 */
public class ProxyTestDemo {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
