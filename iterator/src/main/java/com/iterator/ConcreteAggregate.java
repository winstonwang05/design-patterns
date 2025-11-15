package com.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteAggregate
 * @Description: 具体聚合类
 * @Author: Winston
 * @Date: 2025/11/15 15:19
 * @Version: 1.0
 */
public class ConcreteAggregate implements Aggregate {

    List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(students);
    }

    @Override
    public void remove(Student student) {
        students.remove(student);
    }
}