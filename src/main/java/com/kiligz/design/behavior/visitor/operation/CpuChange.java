package com.kiligz.design.behavior.visitor.operation;

import com.kiligz.design.behavior.visitor.computerPart.Cpu;
import lombok.AllArgsConstructor;

/**
 * 更换cpu操作
 *
 * @author Ivan
 * @date 2022/9/2 15:49
 */
@AllArgsConstructor
public class CpuChange extends Change {
    private final String label;

    @Override
    public void accept(Cpu cpu) {
        cpu.setLabel(label);
    }
}
