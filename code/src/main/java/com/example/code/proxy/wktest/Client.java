package com.example.code.proxy.wktest;


/**
 * @
 */
public class Client {

    public static void main(String[] args) {
        /*静态代理模式---------------*/
//        生成一个真实对象
        Sell factory = new Vendor();
//        真实对象传入到代理对象中
        BusinessAgent businessAgent = new BusinessAgent(factory);
//        代理对象调用具体方法，间接执行真实对象做的操作
        businessAgent.ad();
        businessAgent.sell();


    }

}
