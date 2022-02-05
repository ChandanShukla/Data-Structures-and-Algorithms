package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class FindSubstringWithGivenHash {

    public static long calPow(int power, int pw, int modulo){
        long res = 1;
        while(pw>0){
            res = (res*power)%modulo;
            pw--;
        }
        return res%modulo;
    }


    public static String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        int start = 0;
        int end = 0;
        long []po = new long[k];
        for(int i=0;i<k;i++){
            po[i] = calPow(power,i,modulo);
        }
        if(s.length()==k || s.length()==0){
            return s;
        }
        while(start!=s.length()-k){
            long sum = 0;
            int pw = 0;
            int j =0;
            for(j = start;j<start+k;j++){
                sum += ((long)(s.charAt(j)-'a'+1)*po[pw])%modulo;
                pw++;
            }
            sum = sum%modulo;
            end = j-1;
            if(sum==hashValue){
                break;
            }

            start++;
        }

        return s.substring(start,end+1);

    }

    public static void main(String[] args){
        String s = "xqgfatvtlwnnkxipmipcpqwbxihxblaplpfckvxtihonijhtezdnkjmmk";
        String ans = subStrHash(s,22,51,41,9);
//        String s = "fbxzaad";
//        String ans = subStrHash(s,31,100,3,32);
        System.out.println(ans);
    }
}
