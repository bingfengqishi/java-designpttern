package com.designpattern.decorator;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the origin method");
    }
}
