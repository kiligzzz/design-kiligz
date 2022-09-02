package com.kiligz.design.behavior.visitor.operation;

import com.kiligz.design.behavior.visitor.computerPart.MemoryBank;
import lombok.AllArgsConstructor;

/**
 * 更换内存条操作
 *
 * @author Ivan
 * @date 2022/9/2 15:50
 */
@AllArgsConstructor
public class MemoryBankChange extends Change {
    private final int count;
    private final String label;

    @Override
    public void accept(MemoryBank memoryBank) {
        memoryBank.setCount(count);
        memoryBank.setLabel(label);
    }
}
