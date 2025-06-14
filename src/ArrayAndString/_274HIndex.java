package ArrayAndString;

import java.util.Arrays;
import java.util.Collections;

public class _274HIndex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
//        int[] citations = {1, 3, 1};
        int h = 0;
        Arrays.sort(citations); // 数组升序排列
        // 再将数组降序排列
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - 1 - i];
            citations[citations.length - 1 - i] = temp;
        }
        for (int j = 0; j <= citations.length - 1 && citations[j] >= h + 1; j++){
            h++;
        }
        System.out.println(Arrays.toString(citations));
        System.out.println(h);
    }
    // h 指数要求至少有 h 篇论文的引用次数 >= h
    // 如果我们将数组从大到小排列, h 就是从左数第 h 个元素的值, 如果满足条件
    // 例如, 原数组{3, 0, 6, 1, 5} => 排序后, {6, 5, 3, 1, 0}
    // 解决办法
    // 1) 排序法
            // 将 citations 数组降序排列
            // 从左到右遍历, 找到最大的h, 使得前 h 个元素的引用次数 >= h
            // 因为数组已经排序, 第 h 个元素的值就是候选 h, 检查前 h 个是否都 >= h
    // 2) 为什么可行?
            // 排序后, h 指数使数组中的一个临界点, 前 h 个元素 >= h, 后续元素 < h
    public static int hIndex(int[] citations) {
        return 0;
    }
}
