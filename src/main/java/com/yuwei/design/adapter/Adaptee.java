package com.yuwei.design.adapter;

/**
 * 适配者接口
 * @author yuwei
 * @date 2021/5/30 15:19
 */
public class Adaptee {
    public void specificRequest(){
        System.out.println("适配者中的业务代码被调用");
    }
}
