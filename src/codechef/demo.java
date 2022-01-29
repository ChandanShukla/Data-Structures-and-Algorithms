package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class demo {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            double ans=0,sum=0;
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
                sum+=ar[i];
            }
            Arrays.sort(ar);
            sum-=ar[n-1];
            ans=(double)(sum)/(n-1);
            System.out.println(String.format("%.6f", ans+ar[n-1]));

        }
    }
}
