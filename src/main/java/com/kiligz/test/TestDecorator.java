package com.kiligz.test;

import com.kiligz.design.structure.decorator.Drinks;
import com.kiligz.design.structure.decorator.condiment.Pearl;
import com.kiligz.design.structure.decorator.condiment.Pudding;
import com.kiligz.design.structure.decorator.tea.MilkyTea;

/**
 * @author Ivan
 * @date 2022/8/26 16:45
 */
public class TestDecorator {
    public static void main(String[] args) {
        // 奶茶 + 一份珍珠 + 两份布丁
        Drinks drinks = new Pudding(new Pudding(new Pearl(new MilkyTea())));
        System.out.println(drinks.info());
        System.out.println(drinks.money());
    }
}
