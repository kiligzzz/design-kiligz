package com.kiligz.design.behavior.visitor.computerPart;

import com.kiligz.design.behavior.visitor.operation.Operation;

/**
 * 电脑零件接口，一般 实现类不会改变包含类个数（对象的结构）
 *
 * @author Ivan
 * @date 2022/9/2 11:58
 */
public interface ComputerPart {
    void accept(Operation operation);
}
