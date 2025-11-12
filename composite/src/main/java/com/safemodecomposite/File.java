package com.safemodecomposite;


/**
 * @ClassName: File
 * @Description: 文件 叶子节点
 * @Author: Winston
 * @Date: 2025/11/12 15:58
 * @Version: 1.0
 */
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetail() {
        System.out.println("文件：" + getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}