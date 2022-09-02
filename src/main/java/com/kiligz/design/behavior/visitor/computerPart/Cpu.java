package com.kiligz.design.behavior.visitor.computerPart;

import com.kiligz.design.behavior.visitor.operation.Operation;
import lombok.*;

/**
 * cpu
 *
 * @author Ivan
 * @date 2022/9/2 11:59
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cpu implements ComputerPart {
    private String label;

    @Override
    public void accept(Operation operation) {
        operation.accept(this);
    }
}
