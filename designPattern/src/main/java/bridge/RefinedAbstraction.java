package bridge;

/**
 * 扩展抽象化角色
 * @author yuwei
 * @date 2021/5/30 15:44
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        impl.operationImpl();
    }
}
