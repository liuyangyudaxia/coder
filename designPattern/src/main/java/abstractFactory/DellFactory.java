package abstractFactory;

import simpleFactory.Mouse;
import simpleFactory.DellMouse;

/**
 * 戴尔工厂
 * @author yuwei
 * @date 2021/5/25 23:08
 */
public class DellFactory implements AbstractFactory {
    @Override
    public Mouse buildMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard buildKeyBoard() {
        return new DellKeyBoard();
    }
}
