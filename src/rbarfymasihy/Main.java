package rbarfymasihy;
import java.util.Stack;

/** This class contains the main method to test the generic stack array class.
 * @author rbarfymasihy
 * @version 20.02.2024
 */
public class Main {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        GenericStack<String> emptyStack = new GenericStack<>(5);  //A new generic stack String-array with a size of 5, which is meant to be empty.
        GenericStack<String> fullStack = new GenericStack<>(5);   //A new generic stack String-array with a size of 5, which is meant to be full.
        GenericStack<String> stack = new GenericStack<>(5);   //A new generic stack String-array with a size of 5.
        GenericStack<Integer> numbers = new GenericStack<>(5);    //A new generic stack Integer-array with a size of 5.

        stack.push("AM");   //Adding elements to the stack
        stack.push("SEW");  //Adding elements to the stack
        stack.push("ITSI"); //Adding elements to the stack

        stack.peek();   //Peeking the top element of the stack
        stack.push("D");    //Adding elements to the stack

        stack.pop();    //Popping the top element of the stack

        Integer[] intArray = {1, 2, 3, 4, 5};   //An array of integers
        System.out.println(GenericUtils.sum(intArray));

        fullStack.push("A");    //Adding elements to the fullStack
        fullStack.push("B");    //Adding elements to the fullStack
        fullStack.push("C");    //Adding elements to the fullStack
        fullStack.push("D");    //Adding elements to the fullStack
        fullStack.push("E");    //Adding elements to the fullStack

        //fullStack.push("full");   //enable this, to test the StackFullException
        //emptyStack.peek();    //enable this, to test the StackEmptyException
    }
}