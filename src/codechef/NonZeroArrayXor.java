package codechef;

import java.util.Scanner;

public class NonZeroArrayXor {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T>0) {
            int n = scanner.nextInt();
            ;
            if (n == 1) {
                System.out.println(2);
            } else {
                int j = 2;
                System.out.print(j + " ");
                j++;
                for (int i = 1; i < n; i++) {
                    System.out.print(j+" ");
                    j = j + 2;
                }
            }
            T--;
        }
    }
}
