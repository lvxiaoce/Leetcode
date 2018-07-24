package problems;

/**
 * 第七题：反转整数
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。

 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:

 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class Seven {
    public static void main(String args[]){
        System.out.println(reverse(-123));
    }
    public static int reverse(int x) {
        /*
        转化为字符串(分正数和负数两种情况)
         */
        String s = String.valueOf(x);
        if(x<0){
            s = s.substring(1,s.length());
        }
        char[] intChar = s.toCharArray();
        /*
        倒序拼接字符串
         */
        String result = "";
        for(int i=intChar.length-1;i>=0;i--){
            result += intChar[i];
        }
        int resultNum = 0;
        /*
        溢出报错的时候返回0
         */
        try {
             resultNum = x>0?Integer.valueOf(result):Integer.valueOf("-"+result);
        }catch (Exception e){
            resultNum = 0;
        }
        return resultNum;
    }
}
