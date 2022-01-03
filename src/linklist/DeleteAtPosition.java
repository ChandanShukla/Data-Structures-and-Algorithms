package linklist;

import linklist.interfaces.IDeleteAtPosition;

public class DeleteAtPosition implements IDeleteAtPosition {


    @Override
    public LinkList deleteAtPosition(LinkList list, int position) {
        LinkList.Node currNode = list.head;
        LinkList.Node prevNode;
        int count = 1;
        // To delete the head node
        if(count == position){
            list.head = currNode.next;
        }
        // To delete any node other than head node based on its position
        while(currNode.next != null){
            count++;
            prevNode = currNode;
            currNode = currNode.next;
            if(count == position){
                prevNode.next = currNode.next;
                break;
            }

        }

        //If position is out of range of the linklist provided
        System.out.println(count);
        if(count<position){
            System.out.println("Position Element not found");
        }
        return list;
    }
}
