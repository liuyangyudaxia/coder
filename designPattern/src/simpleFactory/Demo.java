package simpleFactory;

/**
 * 简单工厂模式->工厂模式->抽象工厂模式
 * 简单工厂模式：不属于23种设计模式的之一，专门定义一个类用来生产同类产品，他们有共同的父类
 * {@link factory.Demo}
 * {@link abstractFactory.Demo}
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        Mouse dellMouse = SimpleFactory.buildMouse("dell");
        Mouse hpMouse = SimpleFactory.buildMouse("hp");
    }
}
