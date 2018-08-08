package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * 第一百一十九题：杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 3
 * 输出: [1,3,3,1]
 *
 * 进阶：
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 */
public class OneHundredNineteen {

    /**
     * 递归方法求出每一行的数组
     * 由第i个数加上第i+1个数放到新数组中
     * 到上一个数组的倒数第二个数为止
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> resultList = new ArrayList<>();
        if(rowIndex == 0){
            resultList.add(1);
            return resultList;
        }
        resultList.add(1);
        List<Integer> list = getRow(rowIndex-1);
        for (int i = 0; i < list.size()-1; i++) {
            resultList.add(list.get(i)+list.get(i+1));
        }
        resultList.add(1);
        return resultList;
    }
}
