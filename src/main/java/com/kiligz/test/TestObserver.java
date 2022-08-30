package com.kiligz.test;

import com.kiligz.design.behavior.observer.Notice;
import com.kiligz.design.behavior.observer.User;


/**
 * @author Ivan
 * @date 2022/8/30 15:18
 */
public class TestObserver {
    public static void main(String[] args) {
        Notice notice = new Notice();
        User zyf = new User("zyf");

        notice.registerObserver(zyf);
        zyf.printMsg();

        notice.update("test observer");
        zyf.printMsg();
    }
}
