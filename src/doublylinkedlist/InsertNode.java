package doublylinkedlist;

import doublylinkedlist.interfaces.IInsertNode;

public class InsertNode implements IInsertNode {

    @Override
    public DoubleLinkedList insertNode(DoubleLinkedList list, int data) {
        DoubleLinkedList.Node currNode = list.head;
        DoubleLinkedList.Node prevNode = null;
        DoubleLinkedList.Node newNode = new DoubleLinkedList.Node(data);
        newNode.next = null;
        if(currNode == null){
            list.head = newNode;
            newNode.prev = null;
            list.last = newNode;
        }else{
            while(currNode.next != null){
                prevNode = currNode;
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.prev = currNode;
            list.last = newNode;
        }

        return list;
    }
}
