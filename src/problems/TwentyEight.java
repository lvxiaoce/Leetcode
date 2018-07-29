package problems;

/**
 * 第二十八题：实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class TwentyEight {
    public static void main(String[] args){
        System.out.println(strStr("a","a"));
    }

    /**
     * 拿到字符串haystack的长度和 要找出的字符串needle的长度
     * 如果needle长度为0返回0
     * 循环haystack的长度减去needele长度的次数
     * 然后开始截取(0,needel的长度) (1,needel的长度+1)...直到出现一样的位置
     * 如果相等了 返回i
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if(needleLength == 0){
            return 0;
        }
        for (int i = 0; i <= haystackLength-needleLength; i++) {
            if(haystack.substring(i,i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
