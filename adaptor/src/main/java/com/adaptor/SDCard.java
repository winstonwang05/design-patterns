package com.adaptor;


/**
 * @ClassName: SDCard
 * @Description: 被适配者类，里面的数据正是客户端所需要的
 * @Author: Winston
 * @Date: 2025/11/10 16:22
 * @Version: 1.0
 */
public class SDCard {

    public String readData() {
        String data = "SD data is .....";
        System.out.println("SD数据");
        return data;
    }
}