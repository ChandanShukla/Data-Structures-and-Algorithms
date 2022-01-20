package leetcode;

import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(int x) {
        int res = 0;


        while(x!=0){
            int rem = x%10;
            if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && rem > 7){
                return 0 ;
            }

            if(res < Integer.MIN_VALUE/10 || res == Integer.MIN_VALUE/10 && rem < -8){
                return 0 ;
            }
            res = res*10 + rem;
            x = x/10;
        }

        return res;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        System.out.println(reverse(inp));
    }
}
