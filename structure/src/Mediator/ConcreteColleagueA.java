package Mediator;

/**
 * 具体同事类
 * @author yuwei
 * @date 2021/5/31 22:35
 */
public class ConcreteColleagueA extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类A收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事A发出请求");
        mediator.relay(this);
    }
}
