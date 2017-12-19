package com.designpattern.decorator;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class DecoatorTestDemo {
    public static void main(String[] args) {
        Sourceable sourceable= new Source();
        Sourceable obj = new  Decorator(sourceable);
        obj.method();
    }
}
