package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _4_Sum {

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                mp.compute((nums1[i] + nums2[j]) * -1,(k,v) -> v == null?1:v+1);
            }
        }
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                count += mp.getOrDefault((nums3[i] + nums4[j]), 0);
            }
        }
        return count;
    }

    public static void main(String[] args){
        int []nums1 = {-1,-1};
        int []nums2 = {-1,1};
        int []nums3 = {-1,1};
        int []nums4 = {1,-1};
        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));

    }
}
