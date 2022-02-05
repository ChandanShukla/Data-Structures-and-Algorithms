package leetcode;

public class RotateArray {


    public static void rotate(int[] nums, int k) {
        int []res = new int[nums.length];
        k = k%nums.length;
        for(int i = nums.length-k-1,j=0;i<nums.length;i++,j++) {
            res[j] = nums[i];
        }
        for(int i = 0,j=k;i<nums.length-k-1;i++,j++) {
            res[j] = nums[i];
        }
        for(int j=0;j<nums.length;j++) {
            nums[j] = res[j];
        }
    }


    public static void main(String[] args){
        int []arr = {1};
        int k = 2;
        rotate(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

}
