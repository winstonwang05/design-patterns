package com.iterator;


/**
 * @ClassName: Student
 * @Description: 学生对象
 * @Author: Winston
 * @Date: 2025/11/15 15:13
 * @Version: 1.0
 */
public class Student {

    private String name;

    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}