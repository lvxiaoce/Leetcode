package problems;

import java.util.Arrays;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class One {
    public static void main(String args[]){
        int[] nums = {2, 7, 11, 15};
        Arrays.stream(twoSum(nums,9)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        /*
        初始化返回数组
         */
        int[] returnNums = new int[2];
        /*
        两次循环分别从数组中取值,满足条件就将下标放入数组中
         */
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    returnNums[0]=i;
                    returnNums[1]=j;
                }
            }
        }
        return returnNums;
    }
}
