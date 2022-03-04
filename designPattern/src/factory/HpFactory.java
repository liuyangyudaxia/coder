package factory;

import simpleFactory.Mouse;
import simpleFactory.HpMouse;

/**
 * 惠普鼠标工厂
 * @author yuwei
 * @date 2021/5/25 22:52
 */
public class HpFactory implements AbstractFactory {
    @Override
    public Mouse buildMouse() {
        return new HpMouse();
    }
}
