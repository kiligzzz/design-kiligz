package com.kiligz.design.decorator.condiment;

import com.kiligz.design.decorator.Drinks;
import lombok.AllArgsConstructor;

/**
 * 加珍珠（装饰器）
 *
 * @author Ivan
 * @date 2022/8/26 16:43
 */
@AllArgsConstructor
public class Pearl extends Condiment {
    private final Drinks drinks;

    @Override
    public String info() {
        return drinks.info() + " + 珍珠";
    }

    @Override
    public int money() {
        return drinks.money() + 1;
    }
}
