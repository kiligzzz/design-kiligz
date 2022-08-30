package com.kiligz.design.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 公告
 *
 * @author Ivan
 * @date 2022/8/30 14:53
 */
public class Notice {
    private String msg;
    private final List<Observer> observerList;

    public Notice() {
        this.msg = "noting";
        this.observerList = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observerList.add(observer);
        notifyObserver(observer);
    }

    public void update(String msg) {
        this.msg = msg;
        notifyObservers();
    }

    public void notifyObservers() {
        System.out.println("notify observers...");
        observerList.forEach(this::notifyObserver);
    }

    public void notifyObserver(Observer observer) {
        observer.update(msg);
    }
}
