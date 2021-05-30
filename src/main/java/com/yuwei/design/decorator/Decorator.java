package com.yuwei.design.decorator;

/**
 * 抽象装饰角色
 * @author yuwei
 * @date 2021/5/30 15:52
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
