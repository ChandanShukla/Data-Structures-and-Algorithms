package leetcode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            if(nums[start]==val){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
            }else{
                start++;
            }
        }
        return end+1;
    }

    public static void main(String[] args){
        int []arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));
    }
}
