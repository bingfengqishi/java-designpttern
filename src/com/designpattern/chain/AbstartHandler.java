package com.designpattern.chain;

/**
 * Created by lenovo on 2017/11/8.
 */
public abstract  class AbstartHandler {
    public  Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
