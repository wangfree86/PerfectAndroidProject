package com.example.code.proxy.wktest;

/**
 * @author : wk
 * @github :代理类
 * @date : 2020/1/15
 * @desc :代理类
 */
public class BusinessAgent implements Sell {
    //获取真实对象
    private Sell mVendor;
    public BusinessAgent(Sell vendor) {
        this.mVendor = vendor;
    }

    //代理对象执行的方法，调用真实对象，同时做一些新操作
    @Override
    public void sell() {
        System.out.println("before");
        mVendor.sell();
        System.out.println("after");
    }
    @Override
    public void ad() {
        System.out.println("before");
        mVendor.ad();
        System.out.println("after");
    }
}
