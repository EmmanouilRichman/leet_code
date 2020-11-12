package com.emmanouil;

import java.util.HashMap;
import java.util.Stack;

public class valid_parentheses {

    public static boolean isValid(String s){
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()) {
                stack.push(c);
            }
            else if(stack.peek() == map.get(c)){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
