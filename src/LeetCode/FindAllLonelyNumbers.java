package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllLonelyNumbers {

    public static List<Integer> findLonely(int[] nums) {
        List<Integer> myResult = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) {
                set.add(nums[i]);
                if(myResult.contains(nums[i])){
                    myResult.remove(myResult.indexOf(nums[i]));
                }
            }else{
                if(set.contains(nums[i]+1)){
                    if(myResult.contains(nums[i]+1)){
                        myResult.remove(myResult.indexOf(nums[i]+1));
                    }
                }
                if(set.contains(nums[i]-1)){
                    if(myResult.contains(nums[i]-1)){
                        myResult.remove(myResult.indexOf(nums[i]-1));
                    }
                }
                if(!(set.contains(nums[i]-1) || set.contains(nums[i]+1))){
                    set.add(nums[i]);
                    myResult.add(nums[i]);
                }
            }
        }
        return myResult;
    }

    public static void main(String[] args){
        int []arr = {61,83,92,92,42,60,16,45,32,14,40,7,10,34,62,33,65,79,7,14,85,21,36,5,99,25,0,14,52,41,40};
        System.out.println(findLonely(arr));
    }
}
