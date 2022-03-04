package state;

/**
 * @author yuwei
 * @date 2021/5/31 22:15
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ConcreteStateA());
    }
}
