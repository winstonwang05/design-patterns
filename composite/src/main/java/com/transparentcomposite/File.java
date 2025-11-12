package com.transparentcomposite;


/**
 * @ClassName: File
 * @Description: 叶子节点，实现组件接口 并重写方法，由于有些方法并不需要，所以需要抛出异常
 * @Author: Winston
 * @Date: 2025/11/12 19:27
 * @Version: 1.0
 */
public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("文件节点不支持 add 操作");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("文件节点不支持 remove 操作");
    }

    @Override
    public void showDetail() {
        System.out.println("文件名：" + getName());
    }
}