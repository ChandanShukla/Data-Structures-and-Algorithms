package circularlinkedlist;

import circularlinkedlist.AbstractFactory.AbstractCircularFactory;
import circularlinkedlist.Interfaces.IDisplayCircular;
import circularlinkedlist.Interfaces.IInsertNode;

import java.util.Scanner;


public class CircularLinkedList {
    //This node will take into take care of the head node
    Node head = null;
    //This node will take care of the last added node location
    Node tail = null;

    static class Node{
        Node next;
        int data;

        Node(int d){
            data = d;
        }
    }


    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        AbstractCircularFactory factory = AbstractCircularFactory.instance();
        IInsertNode insert = factory.createInsertNode();
        IDisplayCircular display = factory.createDisplayCircular();
        Scanner scn = new Scanner(System.in);
        char check = 'y';
        do{
            System.out.print("Enter the data element: ");
            int data = scn.nextInt();
            insert.insertNode(list,data);
            System.out.println();
            System.out.print("Do you want to enter more details (y/n): ");
            check = scn.next().charAt(0);

        }while(check == 'y');
        System.out.println("Circular LinkList:");
        display.displayCircular(list);

    }

}
