package Collections.Lists;


// First In Last Out

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.push(12);
        stack.push(22);
        stack.push(32);
        System.out.println(stack);
        System.out.println("Stack Pop : "+stack.pop());
        System.out.println("Stack pop : "+stack.pop());
        //stack.pop();

        System.out.println(stack);


    }
}
