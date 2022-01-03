package linklist;

import linklist.interfaces.IInsertNode;

public class InsertNode implements IInsertNode {

    // Method to insert the node inside the LinkList
    @Override
    public LinkList insertNode(LinkList list, int data) {
        LinkList.Node newNode = new LinkList.Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else{
            LinkList.Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }

        return list;

    }

}
