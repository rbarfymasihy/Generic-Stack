package rbarfymasihy;

import java.util.Stack;

/**
 * @author rbarfymasihy
 */
public class Main {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        GenericStack stack = new GenericStack<String>(5);
        GenericStack numbers = new GenericStack<Integer>(5);

        stack.push("SEW");
        stack.push("AM");
        stack.push("INSY");

        stack.pop();

        stack.push("MEDT");
        stack.push("NAWI");

        stack.peek();

        stack.list();
    }
}