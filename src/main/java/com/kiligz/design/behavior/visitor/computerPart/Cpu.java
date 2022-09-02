package com.kiligz.design.behavior.visitor.computerPart;

import com.kiligz.design.behavior.visitor.operation.Operation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * cpu
 *
 * @author Ivan
 * @date 2022/9/2 11:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cpu implements ComputerPart {
    private String label;

    @Override
    public void accept(Operation operation) {
        operation.accept(this);
    }
}
