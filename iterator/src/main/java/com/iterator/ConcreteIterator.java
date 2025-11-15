package com.iterator;


import java.util.List;

/**
 * @ClassName: ConcreteIterator
 * @Description: 具体迭代器类，实现迭代器接口，用来遍历集合
 * @Author: Winston
 * @Date: 2025/11/15 15:14
 * @Version: 1.0
 */
public class ConcreteIterator implements Iterator {


    private List<Student> students;

    private int index;

    public ConcreteIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public Student getNext() {
        Student student = students.get(index);
        index++;
        return student;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }
}