package com.kiligz.design.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
        noticeObserver(observer);
    }

    public void update(String msg) {
        this.msg = msg;
        noticeObservers();
    }

    public void noticeObservers() {
        System.out.println("notice observers...");
        for (Observer observer : observerList) {
            noticeObserver(observer);
        }
    }

    public void noticeObserver(Observer observer) {
        observer.update(msg);
    }

    public void printMsg() {
        System.out.println("[ " + msg + " ]");
    }
}
