package com.jdkdynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyFactory
 * @Description: 代理工厂类 -- 动态代理模式 JDK代理
 * @Author: Winston
 * @Date: 2025/11/9 22:05
 * @Version: 1.0
 */
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    /**
     *ClassLoader loader, 类加载器，继承抽象主题类来加载
     *Class<?>[] interfaces, 从具体主题类获取实现的接口
     * InvocationHandler h 抽象主题类方法的调用处理器
     * @return 代理对象
     */
    public SellTickets getProxyObject() {
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    // proxy 代理对象 这里和 sellTickets都是同样的代理对象 很少用
                    // method 就是继承抽象主题类调用处理程序
                    // 方法的形参
                    // 返回值就是方法的返回值
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK动态代理增强了");
                        Object invoke = method.invoke(trainStation, args);
                        return invoke;
                    }
                }

        );
        return sellTickets;
    }
}