package com.designpattern.observer;

/**
 * Created by lenovo on 2017/12/22.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println(" update self!");
        notifyObservers();
    }
}
