package codechef;

import java.util.Scanner;

public class HungyAshish {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        while(T>0){
            int X = scn.nextInt();
            int Y = scn.nextInt();
            int Z =scn.nextInt();
            if(X>=Y && X<Z){
                System.out.println("PIZZA");
            }else if(X<Y && X>=Z){
                System.out.println("BURGER");
            }else if(X<Y && X<Z){
                System.out.println("NOTHING");
            }else if(X>=Y && X>=Z){
                System.out.println("PIZZA");
            }

            T--;
        }
    }

}
