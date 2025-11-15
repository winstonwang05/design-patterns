package com.iterator;

/**
 * @ClassName: Iterator
 * @Description: 迭代器接口，其实现类用来遍历集合
 * @Author: Winston
 * @Date: 2025/11/15 15:12
 * @Version: 1.0
 */
public interface Iterator {
    /**
     * 是否还有下一个元素
     * @return boolean
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return Student
     */
    Student getNext();

}