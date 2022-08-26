package com.kiligz.design.create.factory.factoryMethod;

import com.kiligz.design.create.factory.support.Computer;
import com.kiligz.design.create.factory.support.Cpu;
import com.kiligz.design.create.factory.support.Graphics;

/**
 * 可以生产Amd或Intel品牌的cpu、显卡（散件）的工厂
 *
 * @author Ivan
 * @date 2022/8/18 23:21
 */
public abstract class ComputerFactory {
    public abstract Computer makeComputer(int type);

    protected Computer makeComputer(int type, String label) {
        switch (type) {
            case 0:
                return new Cpu(label);
            case 1:
                return new Graphics(label);
            default:
                return new Computer();
        }
    }
}
