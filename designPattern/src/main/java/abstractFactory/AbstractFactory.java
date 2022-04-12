package abstractFactory;

import simpleFactory.Mouse;

/**
 * 抽象工厂
 * @author yuwei
 * @date 2021/5/25 22:57
 */
public interface AbstractFactory {
    /**
     * 产品线1
     * @return Mouse
     */
    Mouse buildMouse();

    /**
     * 产品线2
     * @return KeyBoard
     */
    KeyBoard buildKeyBoard();
}
