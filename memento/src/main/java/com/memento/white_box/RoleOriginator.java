package com.memento.white_box;


/**
 * @ClassName: RoleOriginator
 * @Description: 发起者
 * @Author: Winston
 * @Date: 2025/11/15 19:50
 * @Version: 1.0
 */
public class RoleOriginator {
    private int vital; // 生命力
    private int attack; // 攻击力
    private int defense; // 防御力

    /**
     * 初始状态
     */
    public void initState() {
        this.vital = 100;
        this.attack = 10;
        this.defense = 10;
    }

    /**
     * 战斗后状态
     */
    public void afterFight() {
        this.vital = 0;
        this.attack = 0;
        this.defense = 0;
    }

    /**
     * 备份
     * @return Memento
     */
    public Memento saveState() {
        return new Memento(this.attack, this.defense, this.vital);
    }

    /**
     * 恢复
     * @param memento Memento
     */
    public void recoverState(Memento memento) {
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
        this.vital = memento.getVital();
    }

    public void stateDisplay() {
        System.out.println("当前生命力状态为:" + this.vital);
        System.out.println("当前攻击力状态为:" + this.attack);
        System.out.println("当前防御力状态为:" + this.defense);
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