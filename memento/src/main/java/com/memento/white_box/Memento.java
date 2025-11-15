package com.memento.white_box;


/**
 * @ClassName: Memento
 * @Description: 备忘录角色
 * @Author: Winston
 * @Date: 2025/11/15 19:54
 * @Version: 1.0
 */
public class Memento {
    private int vital;
    private int attack;
    private int defense;

    public Memento(int attack, int defense, int vital) {
        this.attack = attack;
        this.defense = defense;
        this.vital = vital;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getVital() {
        return vital;
    }

    public void setVital(int vital) {
        this.vital = vital;
    }
}