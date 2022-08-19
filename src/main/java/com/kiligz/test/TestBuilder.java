package com.kiligz.test;

import com.kiligz.design.builder.User;

/**
 * @author Ivan
 * @date 2022/8/19 10:38
 */
public class TestBuilder {
    public static void main(String[] args) {
        User.UserBuilder builder = User.builder();
        User user = builder.name("zhuyifan")
                .aka("kiligz")
                .age(22)
                .build();
        System.out.println(user);
    }
}
