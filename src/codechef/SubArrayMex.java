package codechef;

import java.util.Scanner;

public class SubArrayMex {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0){
            int N = scn.nextInt();
            int K = scn.nextInt();
            int X = scn.nextInt();
            int []arr = new int[N];
            int j = 0;
            if(K>=X){
                for(int i=0;i<N;i++){
                    if(j<K){
                        if(j<X){
                            arr[i] = j;
                            j++;
                        }else{
                            j++;
                            arr[i] = j;
                        }
                        if(j==K){
                            j = 0;
                        }
                    }
                }
                for(int i=0;i<N;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }

            T--;
        }
    }
}
