package problems;

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *
*  由于返回类型是整数，小数部分将被舍去。
 */
public class SixtyNine {
    public static void main(String[] args){
        System.out.println(mySqrt(2147395600));
    }

    /**
     * 穷举法
     * 一个一个算
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int result = 1;
        while (result*result<=x && result*result>=0){
            result++;
        }
        return result-1;
    }
    /**
     *  递归的方式
     *  4的倍数 sqrt（N）= 2/2 sqrt（N）= 2 sqrt（1/4）sqrt（N）= 2 sqrt（N / 4）
     *  不是4的倍数 1 + 2 * sqrt（N / 4） 例如9,25或49
     *
     * @param x
     * @return
     */
    public static int mySqrt1(int x) {
        if(x < 4 ) {
            return x == 0 ? 0 : 1;
        }
        int res = 2*mySqrt1(x/4);
        //（46340 + 1）*（46340 + 1）> Integer.MAX_VALUE，结果为负数。
        if ((res+1)*(res+1)<=x  && (res+1) * (res+1) >= 0) {
            return res+1;
        }
        return res;
    }
}
