package com.prototypedeep;



import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/8 18:39
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> hobbies =  new ArrayList<>();
        hobbies.add("singing");
        hobbies.add("football");

        Student original = new Student(20, hobbies, "张三");
        Student clone = (Student) original.clone();


        System.out.println(original.getAge()); // 20
        System.out.println(original.getName()); // 张三
        System.out.println(original.getHobbies());  // [singing, football]
        System.out.println(clone.getHobbies() == original.getHobbies()); // true

        clone.setName("李四");
        clone.setAge(24);

        clone.getHobbies().add("basketball");

        // original
        System.out.println(original.getAge()); // 20
        System.out.println(original.getName()); // 张三
        System.out.println(original.getHobbies()); // [singing, football]

        // clone
        System.out.println(clone.getAge()); // 24
        System.out.println(clone.getName()); // 李四
        System.out.println(clone.getHobbies()); // [singing, football, basketball]
    }
}