package com.kiligz.design.factory.factoryMethod;

import com.kiligz.design.factory.support.Computer;

/**
 * @author Ivan
 * @date 2022/8/18 23:22
 */
public class IntelComputerFactory extends ComputerFactory {
    private static final String INTEL = "Intel";

    @Override
    public Computer makeComputer(int type) {
        return makeComputer(type, INTEL);
    }
}
