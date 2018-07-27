package problems;

/**
 * 第六十七题：二进制求和
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 *
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 */
public class SixtySeven {
    public static void main(String[] args){
        System.out.println(addBinary("1010","1011"));
    }
    public static String addBinary(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        for (int i = charsA.length-1; i >=0 ; i++) {
            
        }
        return "";
    }
}
