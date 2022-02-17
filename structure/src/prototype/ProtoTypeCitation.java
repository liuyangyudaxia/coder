package prototype;

/**
 * 原型设计模式测试类
 * @author yuwei
 * @date 2021/5/25 22:37
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("张三", "同学被评为三号学生", "科大");
        Citation obj2 = (Citation) obj1.clone();
        obj2.setName("李四");
    }
}
