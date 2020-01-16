package com.example.code.proxy.wktest;

/**
 * @author : wk
 * @github :
 * @date : 2020/1/15
 * @desc :真实对象，真实操作的行为
 */
public class Vendor implements Sell {
    @Override
    public void sell() {
        System.out.println("In sell method");
    }
    @Override
    public void ad() {
        System.out.println("ad method");
    }
}