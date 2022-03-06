package mediator;

/**
 * 中介模式
 * 对比观察模式理解
 * 观察模式引起动作的对象为被观察者
 * 而中介者模式引起动作的对象为某一个注册到中介者中的对象
 * @author yuwei
 * @date 2021/5/31 22:40
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague c1 = new ConcreteColleagueA();
        Colleague c2 = new ConcreteColleagueB();
        mediator.register(c1);
        mediator.register(c2);
        c1.send();
        System.out.println("--------");
        c2.send();
    }
}
