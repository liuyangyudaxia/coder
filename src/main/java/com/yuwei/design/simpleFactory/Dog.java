package com.yuwei.design.simpleFactory;

/**
 * 具体产品角色dog
 * @author yuwei
 * @date 2021/5/24 22:58
 */
public class Dog implements Animal{
    @Override
    public void say() {
        System.out.println("This is a dog");
    }
}
