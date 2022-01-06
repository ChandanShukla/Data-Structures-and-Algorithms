package circularlinkedlist;

import circularlinkedlist.Interfaces.IInsertNode;

public class InsertNode implements IInsertNode {
    public void insertNode(CircularLinkedList list, int data){
        CircularLinkedList.Node currNode = list.head;
        CircularLinkedList.Node newNode = new CircularLinkedList.Node(data);

        if(currNode == null){
            System.out.println("Inside first:");
            list.head = newNode;
        }
        else{
            list.tail.next = newNode;
        }
        list.tail = newNode;
        list.tail.next = list.head;
    }
}
