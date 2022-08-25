package com.kiligz.design.proxy.jdkProxy;

import com.kiligz.design.proxy.support.Computer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Jdk动态代理处理器
 *
 * @author Ivan
 * @date 2022/8/25 11:36
 */
public class JdkComputerDealers implements InvocationHandler {
    private final Computer computer;

    public JdkComputerDealers(Computer computer) {
        this.computer = computer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[ComputerDealers] publicize computer.");
        Object result = method.invoke(computer, args);
        System.out.println("[ComputerDealers] after-sale computer.");
        return result;
    }
}
