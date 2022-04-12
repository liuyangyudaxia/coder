package sort;

import java.util.Arrays;

/**
 * 堆排序
 * @author yuwei
 */
public class Heap {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("排序前：" + Arrays.toString(array));
        heapSort(array);
        System.out.println("排序后：" + Arrays.toString(array));
    }
    /**
     * 下沉
     */
    public static void downAdjust(int[] array, int parentIndex, int length) {
        int temp = array[parentIndex];
        //定位左孩子
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            //定位左右孩子中最大的
            if (childIndex + 1 < length && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            if (temp >= array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    public static void heapSort(int[] array) {
        //最后一个非叶子节点开始
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
        //循环删除堆顶元素，移到集合尾部
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            downAdjust(array, 0, i);
        }
    }
}
