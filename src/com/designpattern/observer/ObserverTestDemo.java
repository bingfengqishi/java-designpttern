package com.designpattern.observer;

/**
 * Created by lenovo on 2017/12/22.
 */
public class ObserverTestDemo {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}
