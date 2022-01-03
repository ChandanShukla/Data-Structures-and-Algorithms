package linklist;

import linklist.interfaces.IDisplayLinkList;

public class DisplayLinkList implements IDisplayLinkList {
    @Override
    public void displayLinkedList(LinkList list) {
        LinkList.Node startNode = list.head;
        System.out.println("Linked List contains below elements:");
        while(startNode.next != null){
            System.out.println(startNode.data);
            startNode = startNode.next;
        }
        System.out.println(startNode.data);
    }
}
