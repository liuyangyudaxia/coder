package Mediator;

/**
 * @author yuwei
 * @date 2021/5/31 22:36
 */
public class ConcreteColleagueB extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类B收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事B发出请求");
        mediator.relay(this);
    }
}
