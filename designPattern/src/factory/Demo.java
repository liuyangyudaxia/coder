package factory;

import simpleFactory.Mouse;

/**
 * 简单工厂模式->工厂模式->抽象工厂模式
 * {@link simpleFactory.Demo}
 * 工厂模式：何种产品不再由参数指定，而是由工厂本身决定
 * {@link abstractFactory.Demo}
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory dellFactory = new DellMouseFactory();
        Mouse dellMouse = dellFactory.buildMouse();
        AbstractFactory hpFactory = new HpFactory();
        Mouse hpMouse = hpFactory.buildMouse();
    }
}
