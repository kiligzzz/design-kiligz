package com.kiligz.design.structure.decorator.tea;

import com.kiligz.design.structure.decorator.Drinks;

/**
 * 红茶
 *
 * @author Ivan
 * @date 2022/8/26 14:46
 */
public class BlackTea extends Drinks {

    @Override
    public String info() {
        return "红茶";
    }

    @Override
    public int money() {
        return 10;
    }
}
