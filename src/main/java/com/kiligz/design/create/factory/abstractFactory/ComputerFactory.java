package com.kiligz.design.create.factory.abstractFactory;

import com.kiligz.design.create.factory.support.Cpu;
import com.kiligz.design.create.factory.support.Graphics;

/**
 * 提供方法可以选择Amd或Intel品牌工厂代工cpu、显卡，自己组装电脑的工厂
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

    public static ComputerFactory getComputerFactory(Label label) {
        return label.computerFactory;
    }

    public enum Label {
        Amd(new AmdComputerFactory()),
        Intel(new IntelComputerFactory());

        private final ComputerFactory computerFactory;

        Label(ComputerFactory computerFactory) {
            this.computerFactory = computerFactory;
        }
    }
}
