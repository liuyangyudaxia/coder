package abstractFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.Factory1;
import abstractFactory.factory.Factory2;

/**
 * @author yuwei
 * @date 2022/2/17 16:23
 */
public class Demo {
    public static void main(String[] args) {

        AbstractFactory factory1 = new Factory1();
        AbstractFactory factory2 = new Factory2();

        factory1.buildPlant().show();
        factory1.buildAnimal().show();

        factory2.buildPlant().show();
        factory2.buildAnimal().show();
    }
}
