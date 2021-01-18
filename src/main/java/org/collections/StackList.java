package org.collections;

import java.util.Stack;

public class StackList {

    // find the smallest value present in stack after any push or pop operation (2 stacks easy, 1 stack some mathematical)
    // reverse a stack (recursion)
    // sort the values of a stack ( 2 stacks)
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("john");
        stack.push("doe");
        System.out.println("size: " + stack.size());
        String value = stack.peek(); // never removes, return top value only
        System.out.println(value);
        value = stack.pop();
        System.out.println(value);
        System.out.println(stack.size());
      //  stack.peek(); // EmptyStackException
      //  stack.pop(); // EmptyStackException

    }
}
