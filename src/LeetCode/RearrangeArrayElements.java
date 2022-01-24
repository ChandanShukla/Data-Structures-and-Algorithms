package leetcode;

public class RearrangeArrayElements {


    public static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int [] res = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                res[neg] = nums[i];
                neg=neg+2;
            }else if(nums[i]>=0){
                res[pos] = nums[i];
                pos=pos+2;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int []arr = {-1,1};
        int [] res =  rearrangeArray(arr);
        for(int re:res){
            System.out.print(re+",");
        }

    }
}
