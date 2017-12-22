package com.designpattern.command;

/**
 * Created by lenovo on 2017/12/22.
 */
public class Invoker {
    private  Command command;
    public  Invoker(Command command){
        this.command = command;
    }
    public void action(){
        command.exec();
    }
}
