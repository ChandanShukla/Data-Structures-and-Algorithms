package linklist;

import linklist.AbstractFactory.AbstractLinkListFactory;
import linklist.AbstractFactory.LinkListFactory;
import linklist.interfaces.IDeleteAtPosition;
import linklist.interfaces.IDeleteByLinkList;
import linklist.interfaces.IDisplayLinkList;
import linklist.interfaces.IInsertNode;
import org.w3c.dom.Node;

import java.util.Scanner;

public class LinkList {
    Node head;

    // Class to create the nodes inside the LinkList
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;

        }
    }
//    // Method to insert the node inside the LinkList
//    public static LinkList insertNode(LinkList list, int data) {
//        Node newNode = new Node(data);
//        newNode.next = null;
//
//        if (list.head == null) {
//            list.head = newNode;
//        } else{
//            Node last = list.head;
//            while (last.next != null){
//                last = last.next;
//            }
//            last.next = newNode;
//        }
//
//        return list;
//
//    }

    // Code to display the LinkList
//    public static void displayLinkedList(LinkList list) {
//        Node startNode = list.head;
//        System.out.println("Linked List contains below elements:");
//        while(startNode.next != null){
//            System.out.println(startNode.data);
//            startNode = startNode.next;
//        }
//        System.out.println(startNode.data);
//    }


    public static void main(String[] args){
        AbstractLinkListFactory factory = AbstractLinkListFactory.instance();
        IInsertNode inNode = factory.createInsertNode();
        IDisplayLinkList iDisplay = factory.creatDisplayedLinkList();
        IDeleteByLinkList iDeleteByKey = factory.createDeleteByLinkList();
        IDeleteAtPosition iDeleteAtPosition = factory.createDeleteAtPosition();
        LinkList list = new LinkList();

        Scanner scn = new Scanner(System.in);
        char flag = 'n';
        do {
            System.out.println("Enter the number: ");
            int temp = scn.nextInt();
            list = inNode.insertNode(list, temp);
            System.out.println("Do you want to enter more number y/n?");
            flag = scn.next().charAt(0);
        }while (flag != 'n');

        iDisplay.displayLinkedList(list);


        System.out.println("Enter the Key to be deleted");
        int key = scn.nextInt();
        list = iDeleteByKey.deleteByKey(list,key);
        iDisplay.displayLinkedList(list);

        System.out.println("Enter the position where the Key needs to deleted");
        int position = scn.nextInt();
        list = iDeleteAtPosition.deleteAtPosition(list,position);

        iDisplay.displayLinkedList(list);
    }
}
