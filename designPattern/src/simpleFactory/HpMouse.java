package simpleFactory;

/**
 * 惠普鼠标
 * @author yuwei
 * @date 2021/5/24 22:58
 */
public class HpMouse implements Mouse {
    @Override
    public void show() {
        System.out.println("This is a HpMouse");
    }
}
