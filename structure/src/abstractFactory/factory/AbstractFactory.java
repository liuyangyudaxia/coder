package abstractFactory.factory;

import abstractFactory.product.Animal;
import abstractFactory.product.Plant;

/**
 * 抽象工厂
 * @author yuwei
 * @date 2021/5/25 22:57
 */
public interface AbstractFactory {
    /**
     * 产品线1
     * @return Animal
     */
    Animal buildAnimal();

    /**
     *产品线2
     * @return Plant
     */
    Plant buildPlant();
}
