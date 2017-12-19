package com.designpattern.bridge;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSourceable().method();
    }
}
