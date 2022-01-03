package linklist;

import linklist.interfaces.IDeleteByLinkList;

public class DeleteByKey implements IDeleteByLinkList {

    @Override
    public LinkList deleteByKey(LinkList list,int key){
        LinkList.Node currNode = list.head;
        LinkList.Node prev = null;
        //If the head node contains the key value then the node will be deleted by this code
        if(currNode.data == key && currNode.next != null){
            list.head = currNode.next;
            return list;
        }
        //If there is only one node present and that too contains the key value then it will return an empty linklist
        if(currNode.data == key && currNode.next == null){
            return new LinkList();
        }
        //IF there is key value present other than head node than it will be deleted by this code
        while(currNode.next != null){
            prev = currNode;
            currNode = currNode.next;

            if(currNode.data == key){
                prev.next = currNode.next;
                break;
            }
        }

        //If Key is not found in the linklist
        if(currNode == null){
            System.out.println("Key not found");
        }
        return list;

    }
}
