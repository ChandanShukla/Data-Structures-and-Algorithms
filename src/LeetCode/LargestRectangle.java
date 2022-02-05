package leetcode;

public class LargestRectangle {

//    public static int largestRectangleArea(int[] heights) {
//        int start = 0;
//        int end = 0;
//        int max = 0;
//        int []lcomp = leftComp(heights);
//        for(int i=0;i<heights.length;i++){
//            if(lcomp[i]>0){
//
//                int area = Math.min(heights[start],heights[])
//            }
//        }
//        return max;
//    }

    public static int[] leftComp(int[] arr){
        int []temp = new int[arr.length];
        int comp = arr[0];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i]-comp;
        }
        return temp;
    }

    public static void main(String[] args){
        int []heights = {2,1,5,6,2,3};
//        System.out.println(largestRectangleArea(heights));
    }
}
