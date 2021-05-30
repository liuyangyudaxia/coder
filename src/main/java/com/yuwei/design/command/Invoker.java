package com.yuwei.design.command;

/**
 * 调用者
 * @author yuwei
 * @date 2021/5/30 23:00
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void call() {
        System.out.println("调用者执行命令Command");
        command.execute();
    }
}
