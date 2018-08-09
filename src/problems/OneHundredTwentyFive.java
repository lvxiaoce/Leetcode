package problems;

/**
 * 第一百二十五题:验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class OneHundredTwentyFive {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    /**
     * Character.isLetterOrDigit() 判断是否是字母和数字
     * s.charAt(index) 取一个字符串index下标的字符
     *
     * 从头和尾 循环 去掉非法字符
     * 判断头位置字符和尾位置字符是否相等
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        if(s==null || s.length()==0){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while (start<=end){
            while (start<=end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while (start<=end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(start<=end && Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
