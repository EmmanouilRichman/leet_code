package com.emmanouil;

import java.util.Stack;

public class palindrome_linked_list {

    public boolean isPalindrome(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;

        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            if(stack.peek() == curr.val){
                stack.pop();
            }
            curr = curr.next;
        }

        return stack.isEmpty();
    }
}
