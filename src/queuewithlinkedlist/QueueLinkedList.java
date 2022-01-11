package queuewithlinkedlist;

import java.util.Scanner;

public class QueueLinkedList {
    static Node begin;
    static Node last;

    static class Node{
        Node next;
        int data;

        Node(int d){
            data = d;
        }
    }

    public static void queue(int data){
        Node newNode = new Node(data);
        Node currNode = last;
        if(begin == null){
            begin = newNode;
            last = begin;
        }else{
            currNode.next = newNode;
            last = newNode;
        }
    }

    public static void dequeue(){
        if(begin == null){
            System.out.println("\nNo elements present inside the queue");
        }else{
            System.out.println("\nElement "+ begin.data + " taken out from the Queue");
            begin = begin.next;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char check = 'y';
        do{
            System.out.println("Enter the element");
            int data = scanner.nextInt();
            queue(data);
            System.out.println("Do you want to enter more elements (y/n)? ");
            check = scanner.next().charAt(0);
        }while(check != 'n');

        System.out.println("Do you want to Dequeue (y/n) ");
        check = scanner.next().charAt(0);
        while(check != 'n'){
            dequeue();
            System.out.println("Do you want to Dequeue (y/n) ");
            check = scanner.next().charAt(0);
        }

    }


}
