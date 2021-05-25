package com.yuwei.design.abstractFactory;


/**
 * 抽象工厂
 * @author yuwei
 * @date 2021/5/25 22:57
 */
public interface AbstractFactory {
    Animal buildAnimal();

    Plant buildPlant();
}
