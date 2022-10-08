package Stacks;

import java.util.Stack;

public class BalanceOfSymbols {
    public static void main(String[] args) {
        System.out.println(checkBalance("()[()]"));
    }

    static boolean checkBalance(String s) {
        Stack<Character> stk = new Stack<>();
        if(s == null || s.isEmpty()) {
            return true;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') {
                if(!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                } else {
                    return false;
                }
            }
            else if(s.charAt(i) == ']') {
                if(!stk.isEmpty() && stk.peek() == '[') {
                    stk.pop();
                } else {
                    return false;
                }
            }
            else if(s.charAt(i) == '}') {
                if(!stk.isEmpty() && stk.peek() == '{') {
                    stk.pop();
                } else {
                    return false;
                }
            } else {
                stk.push(s.charAt(i));
            }
        }

        return stk.isEmpty();
    }
}
