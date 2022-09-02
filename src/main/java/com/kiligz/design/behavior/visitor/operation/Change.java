package com.kiligz.design.behavior.visitor.operation;

import com.kiligz.design.behavior.visitor.computerPart.Cpu;
import com.kiligz.design.behavior.visitor.computerPart.MemoryBank;

/**
 * 更换操作接口适配器
 *
 * @author Ivan
 * @date 2022/9/2 12:10
 */
public abstract class Change implements Operation {
    @Override
    public void accept(Cpu cpu) {
    }

    @Override
    public void accept(MemoryBank memoryBank) {
    }
}
