package com.kiligz.design.behavior.visitor.computerPart;

import com.kiligz.design.behavior.visitor.operation.Operation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 内存条
 *
 * @author Ivan
 * @date 2022/9/2 12:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoryBank implements ComputerPart {
    private int count;
    private String label;

    @Override
    public void accept(Operation operation) {
        operation.accept(this);
    }
}
