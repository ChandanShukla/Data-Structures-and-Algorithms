package leetcode;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int j = 0;
        int max = 0;
        if(height.length==1){
            return 0;
        }
        if(height.length==2){
            return Math.min(height[start],height[end]);
        }
        while(start!=end){

            int area = Math.min(height[start],height[end])*(end-start);
            max = Math.max(area,max);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
            j++;
        }
        return max;
    }

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int []height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }
}
