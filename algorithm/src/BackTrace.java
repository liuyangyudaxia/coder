import java.util.LinkedList;
import java.util.List;

/**
 * 回溯
 * @author yuwei
 * @date 2022/2/17 10:59
 */
public class BackTrace {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        //全排列，即所有路径集合
        List<List<Integer>> allPath = new LinkedList<>();
        //当前路径，入口路径，path是空的
        List<Integer> path = new LinkedList<>();
        //递归函数入口，可做选择是nums数组
        backTrace(nums, path, allPath);
        return allPath;
    }

    public static void backTrace(int[] nums, List<Integer> path, List<List<Integer>> allPath) {
        //已走路径path的数组长度等于nums的长度,表示走到叶子节点，所以加到全排列集合
        if (nums.length == path.size()) {
            allPath.add(new LinkedList<>(path));
            return;
        }
        for (int num : nums) {
            //剪枝，排查已经走过的路径
            if (path.contains(num)) {
                continue;
            }
            //做选择，加到当前路径
            path.add(num);
            //递归，进入下一层的决策
            backTrace(nums, path, allPath);
            //取消选择
            path.remove(path.size() - 1);
        }
    }
}
