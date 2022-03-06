package Interpreter;

/**
 * 非终结符表达式类
 * @author yuwei
 * @date 2021/5/31 23:27
 */
public class AndExpression implements Expression {
    private final Expression city;
    private final Expression person;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
