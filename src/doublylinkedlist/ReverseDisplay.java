package doublylinkedlist;

import doublylinkedlist.interfaces.IReverseDisplay;

public class ReverseDisplay implements IReverseDisplay {
    @Override
    public void reverseDisplay(DoubleLinkedList list) {
        DoubleLinkedList.Node last = list.last;
        if(list.last == null){
            System.out.println("Empty list");
        }else{
            while(last.prev != null) {
                System.out.println(last.data);
                last = last.prev;
            }
            System.out.println(last.data);
        }
    }
}
