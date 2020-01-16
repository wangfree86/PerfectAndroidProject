package com.example.code.proxy.wktest.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : wk
 * @github :
 * @date : 2020/1/15
 * @desc :动态代理  获取代理对象
 */

//代理对象类，中介类必须实现InvocationHandler接口，
// 作为调用处理器”拦截“对代理类方法的调用。
public class DynamicProxy implements InvocationHandler {
    private Object obj;
    //obj为委托类对象
    public DynamicProxy(Object obj) {
        this.obj = obj;
    }
    //代理对象被调用方法的时候都必然执行
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始真实对象的操作");
        //反射获取到真实对象，执行方法
        Object result = method.invoke(obj, args);
        System.out.println("结束真实对象的操作");
        return result;
    }
}