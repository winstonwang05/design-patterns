package com.adaptor;


/**
 * @ClassName: Computer
 * @Description: 客户端 计算机只能读取TypeC中数据
 * @Author: Winston
 * @Date: 2025/11/10 16:27
 * @Version: 1.0
 */
public class Computer {
    public void ProcessData(TypeC_Port typeC_Port) {
        String data = typeC_Port.readDataFromTypeC();
        System.out.println("计算机成功收到Type C中数据：" + data);
    }
}