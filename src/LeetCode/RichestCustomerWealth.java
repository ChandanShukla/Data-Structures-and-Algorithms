package leetcode;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int []sum = new int [accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int  j=0;j<accounts[0].length;j++){
                sum[i]+=accounts[i][j];
            }
        }
        int max = sum[0];
        for(int k = 0;k<sum.length;k++){
            if(max<sum[k]){
                max=sum[k];
            }
        }

        return max;
    }

    public static void main(String[] args){
        int [][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
}
