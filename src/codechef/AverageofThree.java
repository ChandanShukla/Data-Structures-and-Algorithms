package codechef;

import java.util.Scanner;

public class AverageofThree {

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0){
            int avg = scn.nextInt();
            if(avg==0){
                System.out.print(0+" "+0+" "+0);
                System.out.println();
            }else if(avg==1){
                System.out.print(1+" "+1+" "+1);
                System.out.println();
            }else {
                int total = avg*3;
                System.out.print(1+" ");
                total = total - 1;
                System.out.print(2+" ");
                total = total - 1;
                System.out.print(total);
                System.out.println();
            }
            T--;
        }
    }
}
