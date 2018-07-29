package problems;

/**
 * 第八十八题：合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 * 示例:
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 6
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 */
public class EightyEight {
    public static void main(String[] args){
//        int[] nums1 = {-1,3,0,0,0,0,0};
//        int m = 2;
//        int[] nums2 = {0,0,1,2,3};
//        int n = 5;
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        for (int x:nums1) {
            System.out.print(x+",");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j=n-1,k=m+n-1;
        /*
        从两个数组末尾遍历,判断两个数哪个大,给第一个数组末尾赋值直到i和j小于0
         */
        while(i>=0 && j>=0){
             nums1[k--] = nums2[j]>nums1[i]?nums2[j--]:nums1[i--];
        }
        /*
        针对nums1 为一个空数组的情况
         */
        while (j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}
