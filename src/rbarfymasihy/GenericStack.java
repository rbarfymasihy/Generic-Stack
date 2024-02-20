package rbarfymasihy;

/**
 * @author rbarfymasihy
 * @version 20.02.2024
 */
public class GenericStack {
    private String[] array;
    private int top;

    /**
     * Constructor GenericStack, which provides a parameter for the size of the array.
     * @param size  list size
     */
    public GenericStack(int size) {
        array = new String[size];
        top = -1;
    }

    /**
     * push method, which adds an element to the top of the array.
     * @param element   String to be added
     */
    public void push(String element) {
        if (top == array.length - 1) {
            System.out.println("Stack is full! Cannot push element.");
        } else {
            top++;
            array[top] = element;
            System.out.println("Element pushed: " + element);
        }
    }

    /**
     * Method pop, which returns the top element of the array and deletes it after.
     * @return  top element of array
     */
    public String pop() {
        if (top == -1) {
            return "Stack is empty! Cannot pop element.";
        } else {
            String poppedElement = array[top];
            top--;
            return "Element popped: " + poppedElement;
        }
    }

    /**
     * Method peek, which returns the top element of the array without removing it from the list.
     * @return  top element of array
     */
    public String peek() {
        if (top == -1) {
            return "Stack is empty! Cannot pop element.";
        } else {
            return "Element peeked: " + array[top];
        }
    }

    /**
     * Method isEmpty, which returns true, if the array is empty.
     * @return  true/false
     */
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}
