package stackarrayimpl;

import java.util.Scanner;

public class StackWithArray {
    private static final int MAX = 1000;
    static int []arr = new int[MAX];
    static int top;

    StackWithArray(){
        top = -1;
    }

    static void push(int data){
        if(top >= (MAX - 1)){
            System.out.println("Stack Memory full");

        }else{
            arr[++top] = data;
            System.out.println(data + " Pushed into stack !!");
        }
    }

    static int pop(){
        if(top < 0){
            System.out.println("No element present inside the stack");
            return -1;
        }else{
            int x = arr[top--];
            return x;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char check = 'y';
        do{
            System.out.println("Enter the number");
            int data = scanner.nextInt();
            push(data);
            System.out.println("Do you want to enter more elements");
            check = scanner.next().charAt(0);
        }while(check!='n');
        check = 'y';
        do{
            System.out.println("Do you want to pop any elements from the stack");
            System.out.println("This element is popped out "+pop());
            System.out.println("Do you want to pop more elements from the stack");
            check = scanner.next().charAt(0);
        }while(check != 'n');

    }
}
