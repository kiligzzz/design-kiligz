package com.kiligz.test;

import com.kiligz.design.structure.flyweight.PersonMap;

/**
 * @author Ivan
 * @date 2022/8/29 16:28
 */
public class TestFlyweight {
    public static void main(String[] args) {
        String zyf = PersonMap.getPerson("zyf");
        String zyf1 = PersonMap.getPerson("zyf");
        System.out.println(zyf == zyf1);
    }
}
