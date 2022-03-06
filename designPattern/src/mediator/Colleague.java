package mediator;

/**
 * 抽象同事类
 * @author yuwei
 * @date 2021/5/31 22:33
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
