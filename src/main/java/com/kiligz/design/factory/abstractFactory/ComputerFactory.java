package com.kiligz.design.factory.abstractFactory;

import com.kiligz.design.factory.support.Cpu;
import com.kiligz.design.factory.support.Graphics;

/**
 * 可以选择Amd或Intel品牌工厂代工cpu、显卡，自己组装电脑的工厂
 *
 * @author Ivan
 * @date 2022/8/19 00:40
 */
public abstract class ComputerFactory {
    public abstract Cpu makeCpu();

    public abstract Graphics makeGraphics();

    public void assembleComputer() {
        Cpu cpu = makeCpu();
        Graphics graphics = makeGraphics();
        if (cpu.getLabel().equals(graphics.getLabel())) {
            System.out.printf("[ %s ]:[ computer ]%n", cpu.getLabel());
        }
    }
}
