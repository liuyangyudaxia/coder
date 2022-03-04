package factory;

import simpleFactory.Mouse;

/**
 * 抽象工厂
 * @author yuwei
 * @date 2021/5/25 22:50
 */
public interface AbstractFactory {
    Mouse buildMouse();
}
