package com.safemodecomposite;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/12 16:13
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        File java = new File("Java");
        File python = new File("Python");
        Directory language = new Directory("language");
        language.add(java);
        language.add(python);

        java.showDetail();

        python.showDetail();

        language.showDetail();
    }
}