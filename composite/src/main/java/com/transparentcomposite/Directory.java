package com.transparentcomposite;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Directory
 * @Description: 叶子组合类，包含了叶子节点和组合节点 ，需要实现组合接口
 * @Author: Winston
 * @Date: 2025/11/12 19:33
 * @Version: 1.0
 */
public class Directory implements FileSystemComponent{
    private String name;

    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetail() {
        System.out.println("文件夹名：" + getName() + "{");
        for (FileSystemComponent component : children) {
            System.out.println("文件名：" + component.getName());
        }
        System.out.println("}");
    }
}