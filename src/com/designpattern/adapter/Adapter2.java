package com.designpattern.adapter;

/**
 *对象适配器
 */
public class Adapter2 implements Ps2 {
    private  Usb usb;

    public Adapter2(Usb usb){
        this.usb = usb;
    }
    @Override
    public void isPs2() {
        usb.isUsb();
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
