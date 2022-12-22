package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    //4+3*(6*3-12)
    public static void main(String[] args) {
        System.out.println(convert("4+5/7+9-3"));
    }

    static int Prec(char ch) {
        if(ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        } else {
            return -1;
        }
    }
    static StringBuilder convert(String s) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                postfix.append(s.charAt(i));
            }
            else if(s.charAt(i) == '(') {
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')') {
                while(!stk.isEmpty() && stk.peek() != '(') {
                    postfix.append(stk.pop());
                }
                stk.pop();
            }
            else {
                while(!stk.isEmpty() && Prec(s.charAt(i)) <= Prec(stk.peek())) {
                    postfix.append(stk.pop());
                }
                stk.push(s.charAt(i));
            }
        }
        while(!stk.isEmpty()) {
            postfix.append(stk.pop());
        }
        return postfix;
    }
}
