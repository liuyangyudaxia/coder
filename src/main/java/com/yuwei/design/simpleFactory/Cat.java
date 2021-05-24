package com.yuwei.design.simpleFactory;

/**
 * 具体产品角色cat
 * @author yuwei
 * @date 2021/5/24 22:59
 */
public class Cat implements Animal{
    @Override
    public void say() {
        System.out.println("This is a cat");
    }
}
