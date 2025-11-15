package com.iterator;


import javax.xml.transform.Source;

/**
 * @ClassName: Client
 * @Description: 客户端 测试用例
 * @Author: Winston
 * @Date: 2025/11/15 15:20
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student("张三", 100);
        Student student1 = new Student("里斯", 101);
        Student student2 = new Student("王五", 102);
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add(student);
        concreteAggregate.add(student1);
        concreteAggregate.add(student2);


        Iterator iterator = concreteAggregate.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}