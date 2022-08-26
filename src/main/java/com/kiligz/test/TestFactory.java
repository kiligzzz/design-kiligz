package com.kiligz.test;

import com.kiligz.design.create.factory.factoryMethod.AmdComputerFactory;
import com.kiligz.design.create.factory.factoryMethod.IntelComputerFactory;
import com.kiligz.design.create.factory.simpleFactory.ComputerFactory;
import com.kiligz.design.create.factory.support.Computer;
import com.kiligz.design.create.factory.support.Cpu;
import com.kiligz.design.create.factory.support.Graphics;

/**
 * @author Ivan
 * @date 2022/8/18 16:59
 */
public class TestFactory {
    public static void main(String[] args) {
        System.out.println("=== simple-factory ===");
        testSimpleFactory();
        System.out.println("=== factory-method ===");
        testFactoryMethod();
        System.out.println("=== abstract-factory ===");
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        com.kiligz.design.create.factory.abstractFactory.ComputerFactory amdComputerFactory
                = com.kiligz.design.create.factory.abstractFactory.ComputerFactory.getComputerFactory(
                        com.kiligz.design.create.factory.abstractFactory.ComputerFactory.Label.Amd);
        Cpu cpu = amdComputerFactory.makeCpu();
        Graphics graphics = amdComputerFactory.makeGraphics();
        cpu.info();
        graphics.info();
        amdComputerFactory.assembleComputer();
    }

    private static void testFactoryMethod() {
        com.kiligz.design.create.factory.factoryMethod.ComputerFactory amdComputerFactory = new AmdComputerFactory();
        Computer cpu = amdComputerFactory.makeComputer(0);
        cpu.info();

        com.kiligz.design.create.factory.factoryMethod.ComputerFactory intelComputerFactory = new IntelComputerFactory();
        Computer graphics = intelComputerFactory.makeComputer(1);
        graphics.info();
    }

    private static void testSimpleFactory() {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer cpu = computerFactory.makeComputer(0);
        Computer graphics = computerFactory.makeComputer(1);
        cpu.info();
        graphics.info();
    }

}
