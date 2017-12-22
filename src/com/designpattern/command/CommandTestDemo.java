package com.designpattern.command;

/**
 * Created by lenovo on 2017/12/22.
 */
public class CommandTestDemo {
    public static void main(String[] args) {
        Reciver reciver = new Reciver();
        Command command = new MyCommand(reciver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
