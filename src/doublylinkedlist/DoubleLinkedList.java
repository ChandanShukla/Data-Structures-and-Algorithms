package doublylinkedlist;

import doublylinkedlist.abstractfactory.AbstractDoubleFactory;
import doublylinkedlist.interfaces.IDisplayDoubly;
import doublylinkedlist.interfaces.IInsertNode;
import doublylinkedlist.interfaces.IReverseDisplay;

import java.util.Scanner;

public class DoubleLinkedList{
    Node head = null;
    static Node last = null;

    public static class Node{
        Node next;
        Node prev;
        int data;

        Node(int d){
            data = d;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        AbstractDoubleFactory factory = AbstractDoubleFactory.instance();
        IInsertNode insert =  factory.createInsertNode();
        IDisplayDoubly display = factory.createDisplayDoubly();
        IReverseDisplay reverseDisplay = factory.createReverseDisplay();
        char check = 'y';

        do{
            System.out.print("Enter the number: ");
            int data = scn.nextInt();
            list = insert.insertNode(list,data);
            System.out.println();
            System.out.print("Do you want to enter new number (y/n): ");
            check = scn.next().charAt(0);

        }while(check != 'n');

        System.out.println("List is below");
        display.displayDoubly(list);

        System.out.println("List in Reverse order");
        reverseDisplay.reverseDisplay(list);

    }
}
