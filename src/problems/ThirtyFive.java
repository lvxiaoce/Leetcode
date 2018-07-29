package problems;

/**
 * 第35题：搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 *
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 *
 * 示例 4:
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class ThirtyFive {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,0));
    }

    /**
     * 循环该数组
     * 如果有数等于或者大于目标数 直接返回当前下标就是 将会插入的位置
     * 直到循环结束
     * 如果到循环结束数组中也没有等于或者大于目标数的值
     * 说明目标数比数组中的数都大,返回数组长度 就是将会插入的位置
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
