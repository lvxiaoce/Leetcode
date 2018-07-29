package problems;

import java.util.Stack;

/**
 * 第六十六题：加一
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class SixtySix {
    public static void main(String[] args){
        int[] nums = {2,4,9,3,7};
        for (int i:plusOne(nums)) {
            System.out.println(i);
        }
    }

    /**
     * 初始化一个后进先出的栈
     * 循环
     * 如果最后一位不是9 最后一位加一放入栈中 再把其他的值也都放入栈中
     * 如果最后一位是9 放一个0进栈 如果到最后一位还是9 则放入0之后再放一个1
     * 新建一个栈大小的数组
     * 把栈的数放入数组中
     *
     * tips：int型数组没数字的话默认是0
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i]==9){
                stack.push(0);
                if(i==0){
                    stack.push(1);
                }
            }else{
                stack.push(digits[i]+1);
                while (i!=0){
                    i--;
                    stack.push(digits[i]);
                }
                break;
            }
        }
        int j = 0;
        int[] result = new int[stack.size()];
        while (!stack.isEmpty()){
            result[j] = stack.pop();
            j++;
        }
//        int[] result = new int[5];
//        result[0] = 1;
        return result;
    }
}
