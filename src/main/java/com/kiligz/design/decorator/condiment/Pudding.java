package com.kiligz.design.decorator.condiment;

import com.kiligz.design.decorator.Drinks;
import lombok.AllArgsConstructor;

/**
 * 加布丁（装饰器）
 *
 * @author Ivan
 * @date 2022/8/26 16:38
 */
@AllArgsConstructor
public class Pudding extends Condiment {
    private final Drinks drinks;

    @Override
    public String info() {
        return drinks.info() + " + 布丁";
    }

    @Override
    public int money() {
        return drinks.money() + 2;
    }
}
