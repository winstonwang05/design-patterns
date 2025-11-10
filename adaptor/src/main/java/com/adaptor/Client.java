package com.adaptor;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/10 16:29
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCard();
        TypeC_Port sdAdaptor = new SDAdaptor(sdCard);
        computer.ProcessData(sdAdaptor);
    }
}