package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AllLonelyNumbers {

    public static List<Integer> findLonely(int[] nums) {
        List<Integer> myResult = new ArrayList<Integer>();
        Arrays.sort(nums);
        if(nums.length==1){
            List<Integer> res = new ArrayList<>();
            res.add(nums[0]);
            return res;
        }
        if(nums.length!=0){
            if(nums[0]!=nums[1] && nums[0]+1!=nums[1]){
                myResult.add(nums[0]);
            }
        }
        for(int i = 1;i<nums.length-1;i++) {
            if(nums[i]!=nums[i+1] && nums[i] != nums[i-1] && nums[i]+1!=nums[i+1] && nums[i]-1!=nums[i-1]){
                myResult.add(nums[i]);
            }
        }
        if(nums[nums.length-2]!=nums[nums.length-1] && nums[nums.length-2]!=nums[nums.length-1]-1){
            myResult.add(nums[nums.length-1]);
        }
        return myResult;
    }

    public static void main(String[] args){
        int []arr = {1,3};
        System.out.println(findLonely(arr));
    }
}
