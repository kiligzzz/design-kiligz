package com.kiligz.design.proxy.support;

/**
 * 电脑工厂，制造和出售
 *
 * @author Ivan
 * @date 2022/8/25 11:10
 */
public class ComputerFactory implements Computer {

    @Override
    public void makeComputer() {
        System.out.println("[ComputerFactory] make computer.");
    }

    @Override
    public void saleComputer() {
        System.out.println("[ComputerFactory] sale computer.");
    }
}
