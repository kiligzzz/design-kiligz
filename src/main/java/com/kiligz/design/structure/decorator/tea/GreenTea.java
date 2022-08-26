package com.kiligz.design.structure.decorator.tea;

import com.kiligz.design.structure.decorator.Drinks;

/**
 * 绿茶
 *
 * @author Ivan
 * @date 2022/8/26 14:47
 */
public class GreenTea extends Drinks {
    @Override
    public String info() {
        return "绿茶";
    }

    @Override
    public int money() {
        return 11;
    }
}
