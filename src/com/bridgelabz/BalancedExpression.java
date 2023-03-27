package com.bridgelabz;

import java.util.Stack;

public class BalancedExpression {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();

}

    public static void main(String[] args) {
        String expr = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
        boolean balanced = isBalanced(expr);
        System.out.println(balanced);
    }
    }