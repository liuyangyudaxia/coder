package responsibility;

/**
 * @author yuwei
 * @date 2021/5/30 23:09
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求");
            }
        }
    }
}
