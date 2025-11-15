package com.memento.black_box;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/15 20:30
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {

        // 战斗前
        RoleOriginator roleOriginator = new RoleOriginator();
        roleOriginator.initState();
        roleOriginator.stateDisplay();
        System.out.println("---------------------------------");
        // 备份
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(roleOriginator.saveState());

        // 战斗后
        roleOriginator.afterFight();
        roleOriginator.stateDisplay();
        System.out.println("---------------------------------");
        // 恢复
        roleOriginator.recoverState(careTaker.getMemento());
        roleOriginator.stateDisplay();


    }
}