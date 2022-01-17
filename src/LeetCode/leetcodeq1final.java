package Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcodeq1final {

    public static String[] getSequence(String str, int k, char replace){
        if(str.length() == 0){
            ArrayList baseResult = new ArrayList<String>();
            return (String[]) baseResult.toArray(new String[baseResult.size()]);
        }


        ArrayList<String> myResult = new ArrayList<>();
        if(str.length() >= k){
            myResult.add(str.substring(0,k));
            List<String> smallsol =  Arrays.asList(getSequence(str.substring(k),k,replace));
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
        return myResult.toArray(new String[myResult.size()]);

    }
    public static void main(String[] args){
        String [] temp = getSequence("abcdef",8,'x');
        for(int i = 0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
