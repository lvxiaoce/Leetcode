package problems;

/**
 * 第三十八题：报数
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 6.     312211
 * 7.     13112221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 *
 * 示例 1:
 * 输入: 1
 * 输出: "1"
 *
 * 示例 2:
 * 输入: 4
 * 输出: "1211"
 *
 */
public class ThirtyEight {
    public static void main(String[] args){
        System.out.println(countAndSay(6));
    }

    /**
     * 递归的方法 当n=1的时候返回1
     * 然后循环用一个指针 记录重复元素的次数
     * 当结尾时候 和不相等的时候  加到stringbuffer上
     * 然后让指针为0
     * 直到循环结束
     *
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String str = countAndSay(n-1);
        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();
        int i = 0;
        for (int j = 0; j < chars.length; j++) {
            if(chars[i]==chars[j]){
                i++;
            }
            if( j==chars.length-1){
                sb.append(String.valueOf(i)+String.valueOf(chars[i-1]));
                break;
            }
            if(chars[i]!=chars[j]){
                sb.append(String.valueOf(i)+String.valueOf(chars[i-1]));
                str = str.substring(i,str.length());
                chars = str.toCharArray();
                j = -1;
                i = 0;
            }
        }
        return sb.toString();
    }
}
