package com.kiligz.test;

import com.kiligz.design.behavior.mediator.User;

/**
 * @author Ivan
 * @date 2022/8/31 17:32
 */
public class TestMediator {
    public static void main(String[] args) {
        User zyf = new User("zyf");
        User gmj = new User("gmj");

        zyf.sendMsg("miss you.");
        gmj.sendMsg("me too.");
    }
}
