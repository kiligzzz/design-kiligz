package com.kiligz.test;

import com.kiligz.design.structure.proxy.cglibProxy.CglibComputerDealers;
import com.kiligz.design.structure.proxy.jdkProxy.JdkComputerDealers;
import com.kiligz.design.structure.proxy.support.Computer;
import com.kiligz.design.structure.proxy.staticProxy.ComputerDealers;
import com.kiligz.design.structure.proxy.support.ComputerFactory;

import java.lang.reflect.Proxy;

/**
 * @author Ivan
 * @date 2022/8/25 11:14
 */
public class TestProxy {
    public static void main(String[] args) {
//        testStaticProxy();
//        testJdkProxy();
        testCglibProxy();
    }

    public static void testStaticProxy() {
        Computer computerFactory = new ComputerFactory();
        Computer computerDealers = new ComputerDealers(computerFactory);
        computerDealers.saleComputer();
    }

    public static void testJdkProxy() {
        Computer computerFactory = new ComputerFactory();
        Computer computerDealers = (Computer) Proxy.newProxyInstance(
                Computer.class.getClassLoader(),
                new Class[]{Computer.class},
                new JdkComputerDealers(computerFactory));
        computerDealers.saleComputer();
    }

    public static void testCglibProxy() {
        CglibComputerDealers computerDealers = new CglibComputerDealers();
        ComputerFactory proxy = (ComputerFactory) computerDealers.getProxy(ComputerFactory.class);
        proxy.saleComputer();
    }
}
