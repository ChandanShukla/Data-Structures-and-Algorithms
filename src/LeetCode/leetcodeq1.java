package Practice;

import java.util.ArrayList;

public class leetcodeq1 {

    public static ArrayList<String> getSequence(String str,int k,char replace){
        if(str.length() == 0){
            ArrayList baseResult = new ArrayList<String>();
            return baseResult;
        }


        ArrayList<String> myResult = new ArrayList<>();
        if(str.length() >= k){
            myResult.add(str.substring(0,k));
            ArrayList<String> smallsol = getSequence(str.substring(k),k,replace);
            for(String sol:smallsol){
                myResult.add(sol);
            }
        }else{
            int check = k-str.length();
            String temp = "";
            for(int i=0;i<check;i++){
                temp+=replace;
            }
            myResult.add(str+temp);
        }
        return myResult;

    }


    public static void main(String[] args){
        System.out.println(getSequence("abcdef",8,'x'));

    }
}
