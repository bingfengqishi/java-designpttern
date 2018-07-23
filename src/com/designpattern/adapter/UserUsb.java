package com.designpattern.adapter;

public class UserUsb implements  Usb {
    @Override
    public void isUsb() {
        System.out.println("use usb");
    }
}
