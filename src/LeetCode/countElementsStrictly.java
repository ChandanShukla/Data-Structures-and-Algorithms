package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class countElementsStrictly {

    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length - 1];
        int count = 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=small && nums[i]!=large){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int []arr = {3,4,4,4,5};
        System.out.println(countElements(arr));
    }
}
