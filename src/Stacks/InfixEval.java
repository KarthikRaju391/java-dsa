package Stacks;

import java.util.Stack;

public class InfixEval{
    public static void main(String[] args) {

    }

    static int evaluate(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Integer> operator = new Stack<>();

        int i = 0;
        while(i < s.length()) {
            int res = 0;

            if(Character.isDigit(s.charAt(i))) {
                operand.push(s.charAt(i)-'0');
            }
        }

        return operator.pop();
    }
}
