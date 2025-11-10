package com.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: ProxyFactory
 * @Description: 代理工厂类 -- cglib代理模式
 * @Author: Winston
 * @Date: 2025/11/10 11:17
 * @Version: 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        // 1.获取代理对象
        Enhancer enhancer = new Enhancer();
        // 2.设置父类的字节码对象  也就是被代理对象
        enhancer.setSuperclass(TrainStation.class);
        // 3.回调函数
        enhancer.setCallback(this);
        // 4.创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理增强了");
        Object invoke = method.invoke(trainStation, objects);
        return invoke;
    }
}