package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;



public class HouseRobber {
    public static List<Integer> oddIdx = new ArrayList<Integer>();
    public static List<Integer> evenIdx = new ArrayList<Integer>();
    public static int rob(int[] nums) {
       if(nums.length==0){
           return 0;
       }
       return robber(nums,0);
    }

    public static int robber(int []nums,int idx){
        if(idx>=nums.length){
            return 0;
        }
        int sumOdd = 0;
        int sumEven = 0;
        if(!oddIdx.contains(idx)){
            sumOdd =  nums[idx]+(robber(nums,idx+2));
        }
        if(!evenIdx.contains(idx+1)&&idx<nums.length){
            idx++;
            sumEven = (nums[idx] + robber(nums,idx+1));
        }

        if(idx%2!=0){
            return sumOdd;
        }else{
            return sumEven;
        }

    }

    public static void main(String[] args){
        int []nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
