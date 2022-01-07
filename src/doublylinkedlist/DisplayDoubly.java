package doublylinkedlist;

import doublylinkedlist.interfaces.IDisplayDoubly;


public class DisplayDoubly implements IDisplayDoubly {

    @Override
    public void displayDoubly(DoubleLinkedList list) {
        DoubleLinkedList.Node currNode = list.head;
        if(currNode == null){
            System.out.println("No Element present inside the list");
        }
        do{
            System.out.println(currNode.data);
            currNode = currNode.next;
        }while(currNode.next != null);
        System.out.println(currNode.data);
    }
}
