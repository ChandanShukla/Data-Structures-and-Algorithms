package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationPhone {

    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0 || digits==null){
            List<String> baseResult = new ArrayList<>();
            return baseResult;
        }
        return findComb(digits);
    }

    private static List<String> findComb(String digits){
        if(digits.length() == 0){
            List<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        String [] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        char first = digits.charAt(0);
        String firstArr = codes[first-'1'];
        String leftOver = digits.substring(1);
        List<String> leftOverLists = findComb(leftOver);
        List<String> myResult = new ArrayList<>();

        for(int i=0;i<firstArr.length();i++){
            for(String leftOverList:leftOverLists){
                myResult.add(firstArr.charAt(i)+leftOverList);
            }

        }
        return myResult;
    }
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String digit = scanner.next();
        System.out.println(letterCombinations("23"));
    }
}
