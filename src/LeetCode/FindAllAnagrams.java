package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

//    public static List<Integer> findAnagrams(String s, String p) {
//        char []str1 = s.toCharArray();
//        char []str2 = p.toCharArray();
//        Arrays.sort(str2);
//        int len = str2.length;
//        return solve(str1,str2,len,0);
//    }
//
//    public static List<Integer> solve(char[] str1, char[] str2, int len, int idx){
//        if(idx==str1.length){
//            List<Integer> baseResult = new ArrayList<>();
//           // baseResult.add(0);
//            return baseResult;
//        }
//        boolean flag = true;
//        List<Integer> myResult = new ArrayList<>();
//        char []temp = Arrays.copyOfRange(str1,idx,idx+len);
//        Arrays.sort(temp);
//        for(int i=0;i<temp.length;i++){
//            if(temp[i]!=str2[i]){
//                flag=false;
//            }
//        }
//        if(flag){
//            myResult.add(idx);
//        }
//        List<Integer> result = solve(str1,str2,len,idx+1);
//
//        for(Integer re: result){
//            myResult.add(re);
//        }
//        return myResult;
//    }

    public static List<Integer> findAnagrams(String s,String p){
        List<Integer> myResult = new ArrayList<Integer>();
        int []track = new int[26];
        for(int i=0;i<s.length();i++){
            track[s.charAt(i)-'a']++;
        }
        int []temp = new int[26];
        for(int i=0;i<p.length();i++){
            temp[p.charAt(i)-'a']++;
        }

        int plen = p.length();
        int slen = s.length();
        int start = 0;
        int end = plen-1;

        while(start<=slen-plen){
            boolean flag = true;
            int []ptrack = temp.clone();
            while(start<=end){
                if(start==end && track[s.charAt(start)-'a']>=1 && ptrack[s.charAt(end)-'a']!=0){
                    track[s.charAt(start)-'a']--;
                }else if(ptrack[s.charAt(end)-'a']==0){
                    flag = false;
                    break;
                }
                ptrack[s.charAt(end)-'a']--;
                end--;
            }
            if(flag){
                myResult.add(start);

            }
            start++;
            end = start+plen-1;
        }
        return myResult;
    }

    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
