package rbarfymasihy;
import java.util.Stack;

/** This class contains the main method to test the generic stack array class.
 * @author rbarfymasihy
 * @version 20.02.2024
 */
public class Main {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        GenericStack emptyStack = new GenericStack<String>(5);  //A new generic stack String-array with a size of 5, which is meant to be empty.
        GenericStack fullStack = new GenericStack<String>(5);   //A new generic stack String-array with a size of 5, which is meant to be full.
        GenericStack stack = new GenericStack<String>(5);   //A new generic stack String-array with a size of 5.
        GenericStack numbers = new GenericStack<Integer>(5);    //A new generic stack Integer-array with a size of 5.

        stack.push("AM");   //Adding elements to the stack
        stack.push("SEW");  //Adding elements to the stack
        stack.push("ITSI"); //Adding elements to the stack

        stack.peek();   //Peeking the top element of the stack
        stack.push("D");    //Adding elements to the stack

        stack.pop();    //Popping the top element of the stack

        fullStack.push("A");    //Adding elements to the fullStack
        fullStack.push("B");    //Adding elements to the fullStack
        fullStack.push("C");    //Adding elements to the fullStack
        fullStack.push("D");    //Adding elements to the fullStack
        fullStack.push("E");    //Adding elements to the fullStack

        //fullStack.push("full");   //enable this, to test the StackFullException
        //emptyStack.peek();    //enable this, to test the StackEmptyException
    }
}