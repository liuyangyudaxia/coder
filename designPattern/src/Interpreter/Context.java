package Interpreter;

/**
 * 环境类
 * @author yuwei
 * @date 2021/5/31 23:30
 */
public class Context {
    private final Expression cityPerson;

    public Context() {
        String[] cities = {"韶关", "广州"};
        Expression city = new TerminalExpression(cities);
        String[] persons = {"老人", "妇女", "儿童"};
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if (ok) {
            System.out.println("您是" + info + "，您本次乘车免费！");
        } else {
            System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
        }
    }
}
