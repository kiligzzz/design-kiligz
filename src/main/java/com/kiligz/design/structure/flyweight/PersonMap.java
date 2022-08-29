package com.kiligz.design.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan
 * @date 2022/8/29 16:18
 */
public class PersonMap {
    private static final Map<String, String> map = new HashMap<>();

    public static String getPerson(String name) {
        return map.computeIfAbsent(name, PersonMap::newPerson);
    }

    private static String newPerson(String name) {
        return "z:" + name;
    }
}
