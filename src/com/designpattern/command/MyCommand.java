package com.designpattern.command;

/**
 * Created by lenovo on 2017/12/22.
 */
public class MyCommand implements  Command {
    private  Reciver reciver;

    public MyCommand(Reciver reciver){
        this.reciver = reciver;
    }
    @Override
    public void exec() {
        reciver.action();
    }
}
