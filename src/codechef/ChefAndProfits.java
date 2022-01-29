package codechef;

import java.util.Scanner;

public class ChefAndProfits {

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0){
            int n = scn.nextInt();
            int bought = scn.nextInt();
            int sold = scn.nextInt();
            System.out.println((sold-bought)*n);
        }
    }
}
