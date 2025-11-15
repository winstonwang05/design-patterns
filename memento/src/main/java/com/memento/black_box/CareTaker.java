package com.memento.black_box;


/**
 * @ClassName: CareTaker
 * @Description: 负责人，窄接口
 * @Author: Winston
 * @Date: 2025/11/15 20:30
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