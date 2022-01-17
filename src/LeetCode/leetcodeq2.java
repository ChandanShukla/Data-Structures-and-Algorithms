package Practice;

public class leetcodeq2 {
    public static int check = 0;
    public static int inMoves(int target,int maxDoubles){
        if(target == 1){
            return 0;
        }
        int count = 0;
        if(target%2!=0 && maxDoubles != 0){
            count = 1 + inMoves(target-1,maxDoubles);

        }
        if(target%2==0 && maxDoubles > 0){
            count = 1 + inMoves(target/2,maxDoubles-1);
        }
        if(maxDoubles==0){
            return count+target-1;
        }

        return count;
    }

    public static void main(String []args){

        System.out.println(inMoves(8,2));
    }
}
