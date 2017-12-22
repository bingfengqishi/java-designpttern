package com.designpattern.observer;

/**
 * Created by lenovo on 2017/12/22.
 */
public class Observer1 implements  Observer {
    @Override
    public void update() {
        System.out.println("the observer1 is update!");
    }
}
