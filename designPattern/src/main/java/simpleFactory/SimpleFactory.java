package simpleFactory;

/**
 * 简单工厂类
 * @author yuwei
 * @date 2021/5/24 23:00
 */
public class SimpleFactory {
    public static Mouse buildMouse(String type) {
        switch (type) {
            case "hp":
                return new HpMouse();
            case "dell":
                return new DellMouse();
            default:
        }
        return null;
    }
}
