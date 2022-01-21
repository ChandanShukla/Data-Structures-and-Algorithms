package leetcode;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
//        if(x<0){
//            return false;
//        }
        String temp = String.valueOf(x);
        int start = 0;
        int end = temp.length()-1;
        boolean res = true;
        while(start<end){
            if(temp.charAt(start)!=temp.charAt(end)){
                res = false;
                return res;
            }
            start++;
            end--;
        }

        return res;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));

    }
}
