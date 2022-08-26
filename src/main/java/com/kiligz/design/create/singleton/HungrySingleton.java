package com.kiligz.design.create.singleton;

/**
 * 饿汉式单例模式
 *
 * @author Ivan
 * @date 2022/8/19 10:23
 */
public class HungrySingleton {
    @SuppressWarnings("all")
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
