package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        int idx = 0;
        int sum = 0;
        int resIdx = 0;
        return threeSum2(nums,idx,sum,resIdx);
    }

    public static List<List<Integer>> threeSum2(int[] nums, int idx, int sum, int resIdx) {
        if(resIdx==3){
            if(sum==0 && resIdx==3){
//                List<List<Integer>> baseResult = Collections.emptyList();
                List<List<Integer>> baseResult = new ArrayList<List<Integer>>();
                List<Integer> base = new ArrayList<Integer>();
                base.add(0);
                baseResult.add(base);
                return baseResult;
            }
            List<List<Integer>> baseResult = new ArrayList<List<Integer>>();
            return baseResult;
        }


        List<List<Integer>> myResult = new ArrayList<>();
        for(int i=idx;i<nums.length-1;i++){

            List<List<Integer>> tempWith = threeSum2(nums,i+1,sum+nums[i],resIdx+1);
            List<List<Integer>> tempWithout = threeSum2(nums,i+1,sum,resIdx);
            for(List<Integer> temp:tempWith){
                temp.add(0,nums[idx]);
                myResult.add(temp);
            }
            for(List<Integer> temp:tempWithout){
                myResult.add(temp);
            }
        }
        return myResult;
    }

    public static void main(String[]args){
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int [] nums = {-1,0,1,2,-1,-4,3};
        //int sum = ints.stream().mapToInt(Integer::intValue).sum();
        System.out.println(threeSum(nums));

    }
}
