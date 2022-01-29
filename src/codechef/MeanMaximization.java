package codechef;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MeanMaximization {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        while(T>0){
            int n = scn.nextInt();
            double sum1 = 0;
            double sum2 = 0;
            int sum1count = 0;
            int sum2count = 0;
            for(int i=0;i<n;i++){
                int temp = scn.nextInt();
                if(sum1>sum2){
                    sum2 += temp;
                    sum2count++;
                    continue;
                }
                if(sum2>sum1) {
                    sum1 += temp;
                    sum1count++;
                    continue;
                }
                if(sum1==sum2){
                    sum1 += temp;
                    sum1count++;
                }
            }
            DecimalFormat df = new DecimalFormat("##.000000");
            double res = (sum2/sum2count + sum1/sum1count);
            System.out.println(df.format(res));
            T--;
        }

    }
}
