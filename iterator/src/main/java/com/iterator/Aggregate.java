package com.iterator;

/**
 * @ClassName: Aggregate
 * @Description: 聚合接口， 相当于一个容器存储对象
 * @Author: Winston
 * @Date: 2025/11/15 15:17
 * @Version: 1.0
 */
public interface Aggregate {

    void add(Student student);

    void remove(Student student);

    Iterator getIterator();
}