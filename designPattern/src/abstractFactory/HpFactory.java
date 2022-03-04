package abstractFactory;

import simpleFactory.Mouse;
import simpleFactory.HpMouse;

/**
 * 惠普工厂
 * @author yuwei
 * @date 2021/5/25 23:06
 */
public class HpFactory implements AbstractFactory {
    @Override
    public Mouse buildMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard buildKeyBoard() {
        System.out.println("product fruit");
        return new HpKeyBoard();
    }
}
