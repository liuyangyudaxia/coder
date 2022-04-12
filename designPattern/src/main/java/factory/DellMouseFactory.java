package factory;

import simpleFactory.Mouse;
import simpleFactory.DellMouse;

/**
 * 戴尔鼠标工厂
 * @author yuwei
 * @date 2021/5/25 22:51
 */
public class DellMouseFactory implements AbstractFactory {
    @Override
    public Mouse buildMouse() {
        return new DellMouse();
    }
}
