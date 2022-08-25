package com.kiligz.design.proxy.staticProxy;

import com.kiligz.design.proxy.support.Computer;

/**
 * 静态代理
 *
 * @author Ivan
 * @date 2022/8/25 11:10
 */
public class ComputerDealers implements Computer {
    private final Computer computerFactory;

    public ComputerDealers(Computer computerFactory) {
        this.computerFactory = computerFactory;
    }

    @Override
    public void makeComputer() {
        computerFactory.makeComputer();
    }

    @Override
    public void saleComputer() {
        System.out.println("[ComputerDealers] publicize computer.");
        computerFactory.saleComputer();
        System.out.println("[ComputerDealers] after-sale computer.");
    }
}
