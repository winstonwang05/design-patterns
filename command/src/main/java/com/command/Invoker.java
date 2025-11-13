package com.command;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Invoker
 * @Description: 调用者类 内部引用命令对象
 * @Author: Winston
 * @Date: 2025/11/13 19:56
 * @Version: 1.0
 */
public class Invoker {
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void orderFinished() {
        System.out.println("订单来了");
        for(Command command : commands) {
            if (command != null) {
                command.excute();
            }
        }
    }


}