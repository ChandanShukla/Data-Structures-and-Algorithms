package stacklinkedlistimpl;

import java.util.Scanner;

public class StackWithLinkedList {
    static Node root;

    static class Node{
        Node next;
        int data;

        Node(int d){
            data = d;
        }

    }

    public static void push(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }else{
            Node temp = root;
            root = newNode;
            root.next = temp;
        }
    }

    public static int pop(){
        if(root == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }else{
            Node temp = root;
            root = root.next;
            temp.next = null;
            return temp.data;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char check = 'y';
        do{
            System.out.print("Enter the number to be pushed: ");
            int data = scn.nextInt();
            push(data);
            System.out.print("Do you want to enter more (y/n): ");
            check = scn.next().charAt(0);
        }while(check != 'n');

        System.out.print("Do you want to pop (y/n): ");
        check = scn.next().charAt(0);
        while(check != 'n'){
            System.out.println("Popped: "+pop());
            System.out.print("Do you want to pop (y/n): ");
            check = scn.next().charAt(0);
        }
    }
}
