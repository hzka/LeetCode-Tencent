package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isValid("]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stacks = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' ||  s.charAt(i) == '{'){
                stacks.push(s.charAt(i));
                continue;
            }
            if(!stacks.isEmpty()){
                if(s.charAt(i) == ')' && stacks.peek() == '('){
                    stacks.pop();
                }else if(s.charAt(i) == ')' && stacks.peek() != '('){
                    return false;
                }else if(s.charAt(i) == '}' && stacks.peek() == '{'){
                    stacks.pop();
                }else if(s.charAt(i) == '}' && stacks.peek() != '{'){
                    return false;
                }else if(s.charAt(i) == ']' && stacks.peek() == '['){
                    stacks.pop();
                }else if(s.charAt(i) == ']' && stacks.peek() != '['){
                    return false;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        if(!stacks.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
