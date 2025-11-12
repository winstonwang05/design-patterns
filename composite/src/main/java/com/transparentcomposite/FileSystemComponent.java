package com.transparentcomposite;

/**
 * @ClassName: FileSystemComponent
 * @Description: 组件接口
 * @Author: Winston
 * @Date: 2025/11/12 19:26
 * @Version: 1.0
 */
public interface FileSystemComponent {

    void showDetail();

    String getName();

    void add(FileSystemComponent component);

    void remove(FileSystemComponent component);
}