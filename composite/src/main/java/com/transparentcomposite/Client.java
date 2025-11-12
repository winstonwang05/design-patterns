package com.transparentcomposite;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/12 19:38
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        File java = new File("java");
        File python = new File("python");
        Directory language = new Directory("language");

        language.add(python);
        language.add(java);

        language.showDetail();
    }
}