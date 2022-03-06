package Interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式类
 * @author yuwei
 * @date 2021/5/31 23:27
 */
public class TerminalExpression implements Expression {
    private final Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        set.addAll(Arrays.asList(data));
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
