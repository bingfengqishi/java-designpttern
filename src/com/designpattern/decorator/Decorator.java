package com.designpattern.decorator;

/***
 * @Author libo
 * @Description 装饰模式
 * @Date 17:33 2018/12/25
 * @return 
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
