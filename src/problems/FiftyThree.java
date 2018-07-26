package problems;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class FiftyThree {
    public static void main(String[] args){
        int[] nums = {-1,0,-2};
        System.out.println(maxSubArray(nums));
    }

    /**
     * 初始化两个初始值 一个存放结果 一个存放每次循环的总和
     * 第一层循环 判断 该值是否大于result 是的话对result赋值
     * 第二层循环 累加 每次累加 判断累加的值是否大于result 大的话赋值
     * 循环结束 返回result
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if(sum>result){
                result = nums[i];
            }
            for (int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                if(sum>result){
                    result = sum;
                }
            }
        }
        return result;
    }
}
