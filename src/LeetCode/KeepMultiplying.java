package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class KeepMultiplying {


    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original = original*2;
            }
        }
        return original;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int []arr = {2,7,9};
        System.out.println(findFinalValue(arr,4));
    }


}
