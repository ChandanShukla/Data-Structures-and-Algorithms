package codechef;

import java.util.Scanner;

public class MaskPolicy {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0){
            int total = scn.nextInt();
            int infected = scn.nextInt();
            if(total-infected>=infected){
                System.out.println(infected);
            }else{
                System.out.println(total-infected);
            }
            T--;
        }
    }
}
