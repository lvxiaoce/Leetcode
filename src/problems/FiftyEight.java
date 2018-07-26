package problems;

/**
 * 第五十八题：最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 */
public class FiftyEight {
    public static void main(String args[]){
        System.out.println(lengthOfLastWord("a"));
    }

    /**
     * 分割
     * 取到最后一个函数
     * 求长度
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        if(strArr.length<1){
            return 0;
        }
        return strArr[strArr.length-1].length();
    }
}
