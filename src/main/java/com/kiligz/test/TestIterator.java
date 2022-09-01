package com.kiligz.test;

import com.kiligz.design.behavior.iterator.ZList;

import java.util.Iterator;

/**
 * @author Ivan
 * @date 2022/9/1 17:52
 */
public class TestIterator {
    public static void main(String[] args) {
        ZList<String> list = new ZList<>(new String[]{"zyf", "gmj", "zzz"});
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
