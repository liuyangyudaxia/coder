package state;

/**
 * @author yuwei
 * @date 2021/5/31 22:10
 */
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前的状态是A");
        context.setState(new ConcreteStateB());
    }
}
