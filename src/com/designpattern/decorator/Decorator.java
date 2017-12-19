package com.designpattern.decorator;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class Decorator implements  Sourceable {

    private  Sourceable sourceable;

    public Decorator(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }
    @Override
    public void method() {
        System.out.println("the method before");
        sourceable.method();
        System.out.println("the method end");
    }
}
