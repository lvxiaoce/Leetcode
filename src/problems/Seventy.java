package problems;

/**
 * 第七十题：爬楼梯
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 步 + 1 步
 * 2.  2 步
 *
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 步 + 1 步 + 1 步
 * 2.  1 步 + 2 步
 * 3.  2 步 + 1 步
 */
public class Seventy {
    public static void main(String[] args){
        System.out.println(climbStairs(44));
    }
    public static int climbStairs(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1) {
            return 1;
        }
        if(n==2){
            return 2;
        }
        int one_step = 1;
        int two_step = 2;
        int all_ways = 0;
        for(int i=2;i<n;i++){
            all_ways = one_step+two_step;
            one_step = two_step;
            two_step = all_ways;
        }

        return all_ways;
    }

    /**
     * 递归 耗时太长
     * @param n
     * @return
     */
    public static int climbStairs1(int n) {
        if(n==1) {
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

}
