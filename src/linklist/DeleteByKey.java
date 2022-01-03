package linklist;

import linklist.interfaces.IDeleteByLinkList;

public class DeleteByKey implements IDeleteByLinkList {

    @Override
    public LinkList deleteByKey(LinkList list,int key){
        LinkList.Node currNode = list.head;
        LinkList.Node prev = null;
        if(currNode.data == key && currNode.next != null){
            list.head = currNode.next;
            return list;
        }
        if(currNode.data == key && currNode.next == null){
            return new LinkList();
        }
        while(currNode.next != null){
            prev = currNode;
            currNode = currNode.next;

            if(currNode.data == key){
                prev.next = currNode.next;
                break;
            }
        }

        if(currNode == null){
            System.out.println("Key not found");
        }
        return list;

    }
}
