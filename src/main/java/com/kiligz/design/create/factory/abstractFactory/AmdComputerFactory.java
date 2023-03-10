package com.kiligz.design.create.factory.abstractFactory;

import com.kiligz.design.create.factory.support.Cpu;
import com.kiligz.design.create.factory.support.Graphics;

/**
 * @author Ivan
 * @date 2022/8/19 00:42
 */
public class AmdComputerFactory extends ComputerFactory {
    private static final String AMD = "Amd";

    @Override
    public Cpu makeCpu() {
        return new Cpu(AMD);
    }

    @Override
    public Graphics makeGraphics() {
        return new Graphics(AMD);
    }
}
