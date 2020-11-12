package com.emmanouil;

public class reverse_linked_list {

    public static ListNode reverseList(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

}