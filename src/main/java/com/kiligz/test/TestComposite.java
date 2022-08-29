package com.kiligz.test;

import com.kiligz.design.structure.composite.Employee;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ivan
 * @date 2022/8/29 16:04
 */
public class TestComposite {
    public static void main(String[] args) {
        Employee member = new Employee();
        member.setName("zyf");

        Employee leader = new Employee();
        leader.setName("gmj");
        leader.setSubordinates(Stream.of(member).collect(Collectors.toList()));

        System.out.println(leader);
    }
}
