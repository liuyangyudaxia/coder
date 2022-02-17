package abstractFactory;

/**
 * 具体产品-嘛
 * @author yuwei
 * @date 2021/5/25 23:01
 */
public class Horse implements Animal {
    @Override
    public void show() {
        System.out.println("I am a horse");
    }
}
