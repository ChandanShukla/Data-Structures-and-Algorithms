package queuewitharray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueueArrayImp {
    static List<Integer> ls = new ArrayList<>();


    public static void queue(int data){
        ls.add(data);
        System.out.print("Element "+data+" added to the queue");
    }

    public static void dequeue(){
        if(ls.size()==0){
            System.out.println("No element present inside the queue\n");

        }else{
            System.out.print("Element "+ls.remove(0)+" from the queue\n");
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char check = 'y';
        do{
            System.out.print("Enter the number ");
            int data = scn.nextInt();
            queue(data);
            System.out.print("\nDo you want to enter more elements ");
            check = scn.next().charAt(0);
        }while(check != 'n');

        System.out.print("DeQueue from the queue(y/n)? ");
        check = scn.next().charAt(0);

        while(check != 'n'){
            dequeue();
            System.out.print("DeQueue from the queue(y/n)? ");
            check = scn.next().charAt(0);
        }

    }

}
