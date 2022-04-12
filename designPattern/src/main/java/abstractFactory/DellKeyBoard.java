package abstractFactory;

/**
 * 戴尔键盘
 * @author yuwei
 * @date 2021/5/25 23:04
 */
public class DellKeyBoard implements KeyBoard {
    @Override
    public void buildKeyBoard() {
        System.out.println("I am DellKeyBoard");
    }
}
