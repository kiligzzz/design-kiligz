package com.kiligz.test;

import com.kiligz.design.prototype.Computer;
import com.kiligz.design.prototype.Prototype;

/**
 * @author Ivan
 * @date 2022/8/19 15:20
 */
public class TestPrototype {
    public static void main(String[] args) throws Exception {
        Computer computer = new Computer(new Computer.Cpu());

        Computer shallowCopyComputer = Prototype.shallowCopy(computer);
        System.out.printf("shallowCopy: %s%n", computer.getCpu() == shallowCopyComputer.getCpu());

        Computer deepCopyComputer = Prototype.deepCopy(computer);
        System.out.printf("deepCopy: %s%n", computer.getCpu() == deepCopyComputer.getCpu());
    }
}
