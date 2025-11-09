package com.prototypedeep;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Student
 * @Description: 浅克隆测试
 * @Author: Winston
 * @Date: 2025/11/8 18:29
 * @Version: 1.0
 */
public class Student implements Cloneable{

    private int age; // 基本类型
    private String name; // 不可变， 引用类型
    private List<String> hobbies; // 可变的 引用类型

    public Student(int age, List<String> hobbies, String name) {
        this.age = age;
        this.hobbies = hobbies;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    /**
     * 克隆方法
     * @return 返回克隆后的新对象
     * @throws CloneNotSupportedException 异常处理
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Student clone = (Student) super.clone();

        List<String> hobbies = new ArrayList<>();
        for (String hobby : this.hobbies) {
            hobbies.add(hobby);
        }
        clone.hobbies = hobbies; // 指向新的
        return clone;

    }
}