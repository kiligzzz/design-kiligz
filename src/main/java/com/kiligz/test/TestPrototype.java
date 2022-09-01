package com.kiligz.test;

import com.kiligz.design.create.prototype.Computer;
import com.kiligz.design.create.prototype.Prototype;

/**
 * @author Ivan
 * @date 2022/8/19 15:20
 */
public class TestPrototype {
    public static void main(String[] args) throws Exception {
        Computer computer = new Computer(new Computer.Cpu());

        Computer shallowCopyComputer = computer.shallowCopy();
        System.out.printf("shallowCopy: %s%n", computer.getCpu() == shallowCopyComputer.getCpu());

        Computer deepCopyComputer = computer.deepCopy();
        System.out.printf("deepCopy: %s%n", computer.getCpu() == deepCopyComputer.getCpu());
    }
}
