package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * 第一百一十八题：杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 5
 * 输出:
 * [
 *  [1],
 *  [1,1],
 *  [1,2,1],
 *  [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class OneHundredAndEighteen {
    public static void main(String[] args){
        System.out.println(generate(3).toString());
    }

    /**
     * 递归方法
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            lists.add(getRowList(i));
        }
        return lists;
    }

    /**
     * 递归方法求出每一行的数组
     * 由第i个数加上第i+1个数放到新数组中
     * 到上一个数组的倒数第二个数为止
     * @param row
     * @return
     */
    private static List<Integer> getRowList(int row){
        List<Integer> resultList = new ArrayList<>();
        if(row == 0){
            resultList.add(1);
            return resultList;
        }
        resultList.add(1);
        List<Integer> list = getRowList(row-1);
        for (int i = 0; i < list.size()-1; i++) {
            resultList.add(list.get(i)+list.get(i+1));
        }
        resultList.add(1);
        return resultList;
    }
}
