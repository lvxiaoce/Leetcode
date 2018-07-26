package problems;

/**
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
        int[] nums1 = {-1,3,0,0,0,0,0};
        int m = 2;
        int[] nums2 = {0,0,1,2,3};
        int n = 5;
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
        merge(nums1,m,nums2,n);
        for (int x:nums1) {
            System.out.print(x+",");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for (int i = 0; i <n; i++) {
                nums1[i] = nums2[i];
            }
        }else{
            for (int i = 0; i <n; i++) {
                for (int j = 0; j <m+n; j++) {
                    if(i<n-1 && nums2[i]>nums2[i+1]){
                        int x = nums2[i];
                        nums2[i] = nums2[i+1];
                        nums2[i+1] = x;
                    }
                    if(nums1[j]>nums2[i] || (nums1[j]==0 && j>nums1.length-n-1)){
                        int s = nums1[j];
                        nums1[j] = nums2[i];
                        nums2[i] = s;
                    }
                }
            }
        }
    }
}
