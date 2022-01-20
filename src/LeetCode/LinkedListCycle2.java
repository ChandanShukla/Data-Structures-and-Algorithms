package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListCycle2 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
//    public ListNode detectCycle(ListNode head) {
//        ListNode start = head;
//        HashSet<ListNode> set = new HashSet<>();
//        if(head==null){
//            return null;
//        }
//        while(start!=null){
//            if(set.contains(start.next)){
//                return start.next;
//            }
//            set.add(start);
//            start=start.next;
//        }
//        return null;
//    }

    public ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;

                }
                return slow;
            }
        }
        return null;

    }

    public static void main(String[] args){

    }

}
