/**
 * 权值分配调用
 * @author yuwei
 * @date 2022/2/18 11:17
 */
public class Weight {
    /**
     * 权重列表
     */
    static int[] weightList = {7,7,3};
    /**
     * 上一次选择索引
     */
    static int i = -1;
    /**
     * 当前调用的权值
     */
    static int cw = 0;
    /**
     * 当前权值列表最大公约数
     */
    static int gcd = 1;
    /**
     * 最大权值
     */
    static int maxWeight = 7;
    public static void main(String[] args) {

        for (int j = 0; j < 11; j++) {
            System.out.print(getWeightDns()+ ",");
        }
    }

    public static String getWeightDns() {
        for (; ; ) {
            i = (i + 1) % weightList.length;
            if (i == 0) {
                //表示当前调度的权值
                cw = cw - gcd;
                if (cw <= 0) {
                    cw = maxWeight;
                }
                System.out.println("\n当前调用权值：" + cw);
            }
            if (weightList[i] >= cw) {
                return String.valueOf(weightList[i]);
            }
        }
    }
}
