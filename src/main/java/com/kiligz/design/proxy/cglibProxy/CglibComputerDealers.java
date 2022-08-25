package com.kiligz.design.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib动态代理方法拦截器
 *
 * @author Ivan
 * @date 2022/8/25 14:05
 */
public class CglibComputerDealers implements MethodInterceptor {
    public Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("[ComputerDealers] publicize computer.");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("[ComputerDealers] after-sale computer.");
        return result;
    }
}
