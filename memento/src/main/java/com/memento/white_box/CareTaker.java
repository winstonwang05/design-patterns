package com.memento.white_box;


/**
 * @ClassName: CareTaker
 * @Description: 负责人：保存备忘录，恢复备忘录
 * @Author: Winston
 * @Date: 2025/11/15 20:00
 * @Version: 1.0
 */
public class CareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}