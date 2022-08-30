package com.kiligz.design.behavior.observer;

/**
 * 用户
 *
 * @author Ivan
 * @date 2022/8/30 15:00
 */
public class User implements Observer {
    private final String name;
    private String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        System.out.println(name + ":" + msg);
    }
}
