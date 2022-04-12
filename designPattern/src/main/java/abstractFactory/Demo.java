package abstractFactory;

/**
 * 简单工厂模式->工厂模式->抽象工厂模式
 * {@link simpleFactory.Demo}
 * {@link factory.Demo}
 * 抽象工厂模式：不仅可以生产鼠标，还可以生产键盘
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {

        AbstractFactory hpFactory = new HpFactory();
        AbstractFactory dellFactory = new DellFactory();

        hpFactory.buildKeyBoard();
        hpFactory.buildMouse();

        dellFactory.buildKeyBoard().buildKeyBoard();
        dellFactory.buildMouse().show();
    }
}
