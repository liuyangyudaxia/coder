package com.yuwei.design.decorator;

/**
 * 具体构建角色
 * @author yuwei
 * @date 2021/5/30 15:50
 */
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构建角色的方法operation");
    }
}
