package circularlinkedlist;

import circularlinkedlist.Interfaces.IDisplayCircular;

public class DisplayCircular implements IDisplayCircular {
    @Override
    public void displayCircular(CircularLinkedList list) {
        CircularLinkedList.Node currNode = list.head;
        //Traverse until the head node is found again
        while(currNode.next != list.head){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
    }
}
