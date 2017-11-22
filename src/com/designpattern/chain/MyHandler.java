package com.designpattern.chain;
/**
 * Created by lenovo on 2017/11/8.
 */
public class MyHandler extends  AbstartHandler implements  Handler {
    private  String name;
    public MyHandler(String name){
        this.name = name;
    }
    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler() != null){
            getHandler().operator();
        }
    }
}
