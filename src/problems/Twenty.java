package problems;

import java.util.Stack;

/**
 * 第二十题：有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 * 有效字符串需满足：

 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。

 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class Twenty {
    public static void main(String[] args){
        System.out.println(isValid("(([]){})"));
    }

    /**
     * 看答案解答(数据类型基础)
     * stack 后进先出的栈
     * 最后一个进去 的先出来
     * 现将左对称的放入栈中
     * 到右对称的从栈中用pop方法取出一个(就是最后一个放进去的)
     * 如果这个是对称的话 到最后栈刚好为空
     * 如果栈不是空的则说明不对称
     *
     **/
    public static boolean isValid(String s) {
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for (char c:chars) {
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.isEmpty()||(Character)stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * 这个的算法复杂度比上面的高一点,但是更容易理解
     * 就是替换方法，把成对的替换成空字符串 直到没法替换为止
     * 如果到最后长度为0说明全部替换成功 是对称的
     * 否则不是
     *
     * @param s
     * @return
     */
    public static boolean isValid1(String s) {
        int length;
        do{
            length = s.length();
            s = s.replace("()","").replace("[]","").replace("{}","");
        }while (length != s.length());
        return s.length() == 0;
    }

//    public static boolean isValid(String s) {
//        Map<String,String> map = new HashMap<String,String>(16);
//        map.put("{","}");
//        map.put("[","]");
//        map.put("(",")");
//        if(s.length()==0){
//            return true;
//        }
//        if(s.length()==1){
//            return false;
//        }
//        if (s.length()%2!=0){
//            return false;
//        }
//        return isValid1(s,map)||isValid2(s,map);
//    }

//    // 这种情况的方法"()[]{}"
//    private static boolean isValid1(String s, Map map){
//        char[] chars = s.toCharArray();
//        for (int i = 0; i <chars.length; i++) {
//            if(i==chars.length-1){
//                break;
//            }
//            Object str = map.get(String.valueOf(chars[i]));
//            if(str == null){
//                return false;
//            }
//            if(str.equals(String.valueOf(chars[i+1]))){
//                i++;
//                continue;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    //回文数方法 "{[]}"
//    private static boolean isValid2(String s, Map map){
//        int length = s.length();
//        for (int i = 0; i < length/2; i++) {
//            Object str = map.get(s.substring(i,i+1));
//            if(str == null){
//                return false;
//            }
//            if(!str.equals(s.substring(length-1-i,length-i))){
//                return false;
//            }
//        }
//        return true;
//    }
}
