package com.kiligz.test;

import com.kiligz.design.structure.facade.Computer;

/**
 * @author Ivan
 * @date 2022/8/26 17:32
 */
public class TestFacade {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("=== do something ===");
        computer.shutdown();
    }
}
