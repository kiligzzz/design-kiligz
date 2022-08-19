package com.kiligz.test;

import com.kiligz.design.prototype.Computer;
import com.kiligz.design.prototype.Prototype;

/**
 * @author Ivan
 * @date 2022/8/19 15:20
 */
public class TestPrototype {
    public static void main(String[] args) throws Exception {
//        Computer computer = new Computer(new Computer.Cpu());
//
//        Computer computer1 = computer.shallowCopy();
//        System.out.printf("shallowCopy: %s%n", computer.getCpu() == computer1.getCpu());
//
//        Computer computer2 = computer.deepCopy();
//        System.out.printf("deepCopy: %s%n", computer.getCpu() == computer2.getCpu());
        Computer computer = new Computer(new Computer.Cpu());
        Computer computer1 = Prototype.deepCopy(computer);
        Computer computer2 = Prototype.shallowCopy(computer);
        System.out.println(computer.getCpu() == computer2.getCpu());
    }
}
