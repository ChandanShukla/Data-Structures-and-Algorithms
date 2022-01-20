package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        String res = "";
        int count = 0;

        String []check = new String[numRows];
        for(int i=0;i<numRows;i++){
            check[i]="";
        }
        while(count!=s.length()){
            int track = 0;
            while(track<numRows && count<s.length()){
                check[track] += s.charAt(count);
                track++;
                count++;
            }
            track = track - 2;
            while(track>0 && count<s.length()){
                check[track] += s.charAt(count);
                track--;
                count++;
            }
        }
        for(int i=0;i<numRows;i++){
            res+=check[i];
        }
        return res;
    }


    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
        System.out.println(convert("PAYPALISHIRING",3));

    }
}
