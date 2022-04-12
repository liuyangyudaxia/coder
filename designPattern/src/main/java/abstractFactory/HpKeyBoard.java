package abstractFactory;

/**
 * 惠普键盘
 * @author yuwei
 * @date 2021/5/25 23:03
 */
public class HpKeyBoard implements KeyBoard {
    @Override
    public void buildKeyBoard() {
        System.out.println("I am HpKeyBoard");
    }
}
