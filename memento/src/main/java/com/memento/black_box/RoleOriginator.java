package com.memento.black_box;


/**
 * @ClassName: RoleOriginator
 * @Description: 发起者，窄接口
 * @Author: Winston
 * @Date: 2025/11/15 20:21
 * @Version: 1.0
 */
public class RoleOriginator {
    private int vital;
    private int attack;
    private int defense;

    public void initState() {
        this.vital = 100;
        this.attack = 10;
        this.defense = 10;
    }

    public void afterFight() {
        this.vital = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public void stateDisplay() {
        System.out.println("当前生命力状态为:" + this.vital);
        System.out.println("当前攻击力状态为:" + this.attack);
        System.out.println("当前防御力状态为:" + this.defense);
    }

    public void recoverState(Memento memento) {
        // 这里需要进行强转
        RoleMemento roleMemento = (RoleMemento) memento;
        this.attack = roleMemento.getAttack();
        this.defense = roleMemento.getDefense();
        this.vital = roleMemento.getVital();

    }

    public RoleMemento saveState() {
        return new RoleMemento(attack, defense, vital);
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getVital() {
        return vital;
    }

    public void setVital(int vital) {
        this.vital = vital;
    }

    /**
     * 备忘录角色，宽接口
     */
    private class RoleMemento implements Memento {
        private int vital;
        private int attack;
        private int defense;

        public RoleMemento() {}

        public RoleMemento(int attack, int defense, int vital) {
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
}