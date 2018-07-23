package com.designpattern.adapter;

/**
 * 类适配器
 */
public class Adapter extends  UserUsb implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }

    @Override
    public void isPs3() {

    }

    @Override
    public void isPs4() {

    }

    @Override
    public void isPs5() {

    }
}
