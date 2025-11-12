package com.safemodecomposite;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Directory
 * @Description: 组合节点 -- 文件夹
 * @Author: Winston
 * @Date: 2025/11/12 16:00
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

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetail() {
        System.out.println("目录：" + getName() + "{");
        for (FileSystemComponent component : children) {
            System.out.println("文件：" + component.getName());
        }
        System.out.println("}");
    }
}