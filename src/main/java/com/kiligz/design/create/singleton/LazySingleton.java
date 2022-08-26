package com.kiligz.design.create.singleton;

/**
 * 懒汉式单例模式（这种最合适，dcl已淘汰）
 *
 * @author Ivan
 * @date 2022/8/19 10:10
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static class SingletonHolder {
        @SuppressWarnings("all")
        private static final LazySingleton instance = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return SingletonHolder.instance;
    }
}
