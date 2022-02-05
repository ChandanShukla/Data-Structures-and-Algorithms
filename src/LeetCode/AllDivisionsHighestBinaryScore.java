package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllDivisionsHighestBinaryScore {

    public static List<Integer> maxScoreIndices(int[] nums) {
        int count1 = 0;
        List<Integer> myResult = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count1++;
            }
        }
        int left=0;
        int right=count1;
        int []sum = new int [nums.length+1];
        sum[0] = count1;
        int max = count1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                left+=1;
                sum[i+1]=left+right;

            }else if(nums[i]==1){
                right = right-1;
                sum[i+1]=left+right;
            }
            if(max<sum[i+1]){
                max = sum[i+1];
            }
        }

        for(int j=0;j<sum.length;j++){
            if(sum[j]==max){
                myResult.add(j);
            }
        }
        return myResult;

    }

    public static void main(String[] args){
        int []arr = {1,1};
        System.out.println(maxScoreIndices(arr));
    }
}
