package com.kiligz.test;

import com.kiligz.design.behavior.visitor.ComputerStructure;
import com.kiligz.design.behavior.visitor.computerPart.Cpu;
import com.kiligz.design.behavior.visitor.computerPart.MemoryBank;
import com.kiligz.design.behavior.visitor.operation.CpuChange;
import com.kiligz.design.behavior.visitor.operation.MemoryBankChange;
import com.kiligz.design.behavior.visitor.operation.Visit;

/**
 * @author Ivan
 * @date 2022/9/2 15:54
 */
public class TestVisitor {
    public static void main(String[] args) {
        ComputerStructure cs = new ComputerStructure();
        cs.add(new Cpu("intel"));
        cs.add(new MemoryBank(2, "colorful"));

        cs.accept(new Visit());

        cs.accept(new CpuChange("amd"));
        cs.accept(new MemoryBankChange(4, "Kingston"));
        cs.accept(new Visit());
    }
}
