package leetcode;

import java.util.Scanner;

public class ImplementstrStr {

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int len = needle.length();
        for(int i=0;i<=haystack.length()-len;i++){
            if(haystack.substring(i,len+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println(strStr("a","a"));

    }
}
