package Interpreter;

/**
 * 抽象表达式类
 * @author yuwei
 * @date 2021/5/31 22:33
 */
interface Expression {
    boolean interpret(String info);
}