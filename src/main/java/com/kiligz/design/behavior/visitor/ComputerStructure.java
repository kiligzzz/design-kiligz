package com.kiligz.design.behavior.visitor;

import com.kiligz.design.behavior.visitor.computerPart.ComputerPart;
import com.kiligz.design.behavior.visitor.operation.Operation;

import java.util.ArrayList;
import java.util.List;

/**
 * 电脑结构类，接收对零件的操作
 *
 * @author Ivan
 * @date 2022/9/2 12:03
 */
public class ComputerStructure {
    private final List<ComputerPart> partList = new ArrayList<>();

    public void accept(Operation operation) {
        for (ComputerPart part : partList) {
            part.accept(operation);
        }
    }

    public void add(ComputerPart part) {
        partList.add(part);
    }

    public void remove(ComputerPart part) {
        partList.remove(part);
    }
}
