package com.adaptor;


/**
 * @ClassName: SDAdaptor
 * @Description: 适配器 将SD中的数据间接出现在 目标接口中 ,因此需要重写方法将SD中的数据调用在方法体
 * @Author: Winston
 * @Date: 2025/11/10 16:24
 * @Version: 1.0
 */
public class SDAdaptor implements TypeC_Port {

    private SDCard sdCard;

    public SDAdaptor(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public String readDataFromTypeC() {
        System.out.println("适配器将SD中的数据转接到了 TypeC Port");
        String data = sdCard.readData();
        return data;
    }
}