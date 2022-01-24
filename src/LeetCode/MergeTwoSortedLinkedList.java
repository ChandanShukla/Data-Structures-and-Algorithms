package leetcode;

import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode currNode = head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ListNode temp = new ListNode();
                temp.val = list1.val;
                currNode.next = temp;
                currNode = currNode.next;
                list1 = list1.next;
            }else if(list1.val>list2.val){
                ListNode temp = new ListNode();
                temp.val = list2.val;
                currNode.next = temp;
                currNode = currNode.next;
                list2 = list2.next;
            }else{
                ListNode temp = new ListNode();
                ListNode temp2 = new ListNode();
                temp.val = list1.val;
                currNode.next = temp;
                currNode = currNode.next;
                list1 = list1.next;
                temp2.val = list2.val;
                currNode.next = temp2;
                currNode = currNode.next;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            currNode.next = list1;
        }
        if(list2!=null){
            currNode.next = list2;
        }
        return head.next;
    }


    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode head = new ListNode();
        ListNode currNode = head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                currNode.next = list1;
                currNode = currNode.next;
                list1 = list1.next;
            }else if(list1.val>list2.val){
                currNode.next = list2;
                currNode = currNode.next;
                list2 = list2.next;
            }else{
                currNode.next = list1;
                currNode = currNode.next;
                currNode = list2;
                currNode = currNode.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            currNode.next = list1;
        }
        if(list2!=null){
            currNode.next = list2;
        }
        return head.next;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

    }
}
