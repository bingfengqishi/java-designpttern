package com.designpattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/11/22.
 * CGLIB动态代理实现
 */
public class EnhancerDemo {
    public static void main(String[] args) {
        Enhancer enhancer  = new Enhancer();
        enhancer.setSuperclass(EnhancerDemo.class);
        enhancer.setCallback(new MethodInterceptorImpl());
        EnhancerDemo demo = (EnhancerDemo)enhancer.create();
        demo.test();
        System.out.println(demo);
    }
    public void test(){
        System.out.println("This is EnhancerDemo Test!");
    }

    private static class  MethodInterceptorImpl implements  MethodInterceptor{

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.err.println("Before invoke"+method);
            Object result = methodProxy.invokeSuper(o,objects);
            System.err.println("After invoke"+method);
            return  result;
        }
    }

}
