package problems;

/**
 * 第九题：回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Nine {
    public static void main(String[] args){
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int x) {
        /*
        负数直接不通过
         */
        if(x<0){
            return false;
        }
        /*
        转为String
         */
        String str = String.valueOf(x);

        int strLength = str.length();
        /*
        提取一半长度的字符串  然后倒序
         */
        char[] frontStrCharArr = str.substring(0,strLength/2).toCharArray();

        String reverseFrontStr = "";

        for(int i=frontStrCharArr.length-1;i>=0;i--){
            reverseFrontStr += frontStrCharArr[i];
        }

        /*
        如果这个倒序之后的字符串和 后一半字符串相等返回true(两种情况 一个长度为奇数 一个长度为偶数)
         */
        if(reverseFrontStr.equals(str.substring(strLength/2,strLength))||reverseFrontStr.equals(str.substring(strLength/2+1,strLength))){
            return true;
        }

        return false;
    }
}
