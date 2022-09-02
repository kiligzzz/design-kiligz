package com.kiligz.design.behavior.visitor.operation;

import com.kiligz.design.behavior.visitor.computerPart.Cpu;
import com.kiligz.design.behavior.visitor.computerPart.MemoryBank;

/**
 * 查看信息操作
 *
 * @author Ivan
 * @date 2022/9/2 12:15
 */
public class Visit implements Operation {
    @Override
    public void accept(Cpu cpu) {
        System.out.printf("[ %s cpu ]%n", cpu.getLabel());
    }

    @Override
    public void accept(MemoryBank memoryBank) {
        System.out.printf("[ %s %s memoryBank ]%n", memoryBank.getCount(), memoryBank.getLabel());
    }
}
