package com.kiligz.design.behavior.visitor.operation;

import com.kiligz.design.behavior.visitor.computerPart.Cpu;
import com.kiligz.design.behavior.visitor.computerPart.MemoryBank;

/**
 * 操作接口
 *
 * @author Ivan
 * @date 2022/9/2 12:01
 */
public interface Operation {
    void accept(Cpu cpu);
    void accept(MemoryBank memoryBank);
}
