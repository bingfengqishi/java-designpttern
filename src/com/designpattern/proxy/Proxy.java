package com.designpattern.proxy;

/**
 * Created by lenovo on 2017/12/20.
 */
public class Proxy implements  Sourceable {

    private Source source;

    public Proxy(){
        super();
        this.source  = new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        after();
    }
    private  void before(){
        System.out.println("the method before");
    }

    private void after(){
        System.out.println("the method after");
    }
}
