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
        ComputerStructure computerStructure = new ComputerStructure();
        computerStructure.add(new Cpu("intel"));
        computerStructure.add(new MemoryBank(2, "colorful"));

        computerStructure.accept(new Visit());

        computerStructure.accept(new CpuChange("amd"));
        computerStructure.accept(new MemoryBankChange(4, "Kingston"));
        computerStructure.accept(new Visit());
    }
}
