package com.kiligz.design.structure.decorator.tea;

import com.kiligz.design.structure.decorator.Drinks;

/**
 * 奶茶
 *
 * @author Ivan
 * @date 2022/8/26 16:31
 */
public class MilkyTea extends Drinks {
    @Override
    public String info() {
        return "奶茶";
    }

    @Override
    public int money() {
        return 12;
    }
}
