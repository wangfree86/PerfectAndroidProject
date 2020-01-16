package com.example.code.proxy.wktest.dynamic;


import com.example.code.proxy.wktest.Sell;
import com.example.code.proxy.wktest.Vendor;

import java.lang.reflect.Proxy;


/**
 *
 */
public class Client {

    public static void main(String[] args) {
        /*动态代理模式---------------*/
//        获取代理对象  真实的对象传入到了代理中
        DynamicProxy inter = new DynamicProxy(new Vendor());
        //Proxy.newProxyInstance 反射获取到代理对象，
        Sell sell = (Sell)(Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[] {Sell.class}, inter));

        sell.sell();
        sell.ad();
    }


    }

