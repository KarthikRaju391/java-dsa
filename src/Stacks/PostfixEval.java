package Stacks;

import java.util.Stack;

public class PostfixEval {
    public static void main(String[] args) {
        System.out.println(evaluate("123*+5-"));
    }

    static int evaluate(String s) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            int resVal;
            if(Character.isDigit(s.charAt(i))) {
                stk.push(s.charAt(i)-'0');
            }else {
                switch (s.charAt(i)) {
                    case '+' -> {
                        resVal = stk.pop() + stk.pop();
                        stk.push(resVal);
                    }
                    case '-' -> {
                        resVal = Math.abs(stk.pop() - stk.pop());
                        stk.push(resVal);
                    }
                    case '*' -> {
                        resVal = stk.pop() * stk.pop();
                        stk.push(resVal);
                    }
                    case '/' -> {
                        int op1 = stk.pop();
                        int op2 = stk.pop();
                        resVal = op2 / op1;
                        stk.push(resVal);
                    }
                }
            }
        }
        return stk.pop();
    }
}
