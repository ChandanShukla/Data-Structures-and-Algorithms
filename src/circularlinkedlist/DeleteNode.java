package circularlinkedlist;

import circularlinkedlist.Interfaces.IDeleteNode;

public class DeleteNode implements IDeleteNode {
    @Override
    public CircularLinkedList deleteNode(CircularLinkedList list,int item) {
        CircularLinkedList.Node currNode = list.head;
        CircularLinkedList.Node prevNode;

        if(currNode.data == item && currNode.next!=null){
            list.head = currNode.next;
            list.tail.next = list.head;
            return list;
        }
        do{
            prevNode = currNode;
            currNode = currNode.next;
            if(currNode.data == item){
                prevNode.next = currNode.next;
                return list;
            }

        }while(currNode.next != list.head);
        return list;
    }
}
