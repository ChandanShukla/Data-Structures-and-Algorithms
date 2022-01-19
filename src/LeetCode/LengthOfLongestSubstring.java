package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class LengthOfLongestSubstring {
    public static HashMap<Character,Integer> seen = new HashMap<Character,Integer>();
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        seen.clear();
        for(end = 0;end<s.length();end++){
            if(seen.containsKey(s.charAt(end))){
                max = end - start;
                start = Math.max(start,seen.get(s.charAt(end))+1);
                String temp = s.substring(start);
                return Math.max(max,lengthOfLongestSubstring(temp));
            }
            seen.put(s.charAt(end),end);

        }

        if(end == s.length()){
            return end - start;
        }

        return max;
    }



    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String inp = scn.next();
        System.out.println(lengthOfLongestSubstring(inp));




    }
}
