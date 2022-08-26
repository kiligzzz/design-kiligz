package com.kiligz.test;

import com.kiligz.design.create.builder.Computer;
import com.kiligz.design.create.builder.Cpu;
import com.kiligz.design.create.builder.Graphics;

/**
 * @author Ivan
 * @date 2022/8/19 10:38
 */
public class TestBuilder {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .name("Mac")
                .cpu(new Cpu("Intel"))
                .graphics(new Graphics("Intel"))
                .build();
        computer.info();
    }
}
