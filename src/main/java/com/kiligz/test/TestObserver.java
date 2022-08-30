package com.kiligz.test;

import com.kiligz.design.behavior.observer.Subject;
import com.kiligz.design.behavior.observer.User;


/**
 * @author Ivan
 * @date 2022/8/30 15:18
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        User zyf = new User("zyf");

        subject.registerObserver(zyf);
        zyf.printMsg();

        subject.update("test observer");
        zyf.printMsg();
    }
}
