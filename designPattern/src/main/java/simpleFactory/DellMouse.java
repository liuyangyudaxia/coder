package simpleFactory;

/**
 * 戴尔鼠标
 * @author yuwei
 * @date 2021/5/24 22:59
 */
public class DellMouse implements Mouse {
    @Override
    public void show() {
        System.out.println("This is a DellMouse");
    }
}
