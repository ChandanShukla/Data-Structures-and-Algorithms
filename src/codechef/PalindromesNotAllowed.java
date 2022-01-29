package codechef;

import java.util.Scanner;

public class PalindromesNotAllowed {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0){
            int N = scn.nextInt();
            String res = "";
            int count = 0;
            for(int i=0;i<N;i++){
                count = count%26;
                int temp = 'a' + count;
                char c = (char)temp;
                res += c;
                count = count + 7;
            }
            System.out.println(res);
            T--;
        }
    }
}
