package com.yuwei.design.bridge;

/**
 * 实现化角色
 * @author yuwei
 * @date 2021/5/30 15:42
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化角色被访问");
    }
}
