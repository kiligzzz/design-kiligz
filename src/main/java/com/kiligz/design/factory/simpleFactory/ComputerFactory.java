package com.kiligz.design.factory.simpleFactory;

import com.kiligz.design.factory.support.Computer;
import com.kiligz.design.factory.support.Cpu;
import com.kiligz.design.factory.support.Graphics;

/**
 * 可以生产cpu和显卡的工厂
 *
 * @author Ivan
 * @date 2022/8/18 23:13
 */
public class ComputerFactory {
    public Computer makeComputer(int type) {
        switch (type) {
            case 0:
                return new Cpu();
            case 1:
                return new Graphics();
            default:
                return new Computer();
        }
    }
}
