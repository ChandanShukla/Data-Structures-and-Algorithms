package leetcode;

public class BestTimeToBuySell {
    public static int maxProfit(int[] prices) {

        int max = 0;
        int start = 0;
        int end = 1;
        while(end<prices.length){
            if(prices[start]>prices[end]){
                start = end;
                end++;
            }else{
                max = Math.max(max,prices[end]-prices[start]);
                end++;
            }
        }
        return max;

    }


    public static void main(String[] args){
        int []prices = {7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }

}
