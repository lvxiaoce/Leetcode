package problems;

/**
 * 第十四题：最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class Fourteen {
    public static void main(String args[]){
        String[] s= {"a"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int index = 1;
        String a;
        String b = "";
        int i = 0;
        for(;i<strs.length;i++){
            /*
            如果数组内有空字符串,直接返回"";
             */
            if(strs[i].length()<index){
                return result;
            }
            a = strs[i].substring(0,index);
            if(i==0){
                b=a;
                /*
                数组中只有一个字符的情况{"c"}
                 */
                if(i==strs.length-1){
                    result = b;
                }
            }else{
                if(a.equals(b)){
                    /*
                    只有当循环到最后一个字符串的时候才赋值
                     */
                    if(i==strs.length-1){
                        result = b;
                        /*
                        防止数组内字符串只有1位
                         */
                        if(index==strs[i].length()){
                            break;
                        }
                        /*
                        前缀下标+1
                         */
                        index++;
                        /*
                        循环完一遍重新从0开始循环
                         */
                        i=-1;
                    }
                    continue;
                }else{
                    break;
                }
            }
        }
        return result;
    }
}
