package responsibility;

/**
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNextHandler(handler2);

        handler1.handleRequest("one");
    }
}
