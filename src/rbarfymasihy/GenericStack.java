package rbarfymasihy;

/** This class contains the methods for a generic String stack array.
 * @author rbarfymasihy
 * @version 20.02.2024
 */
public class GenericStack<T> {
    private T[] array;
    private int top;

    /**
     * Constructor GenericStack, which provides a parameter for the size of the array.
     * @param size  list size
     */
    public GenericStack(int size) {
        this.array = (T[]) new String[size];
        top = -1;
    }

    /**
     * push method, which adds an element to the top of the array.
     * @param element   String to be added
     */
    public void push(T element) {
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
    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot pop element.");
            return (T) "empty";
        } else {
            T poppedElement = array[top];
            top--;
            System.out.println("Element popped: " + poppedElement);
            return poppedElement;
        }
    }

    /**
     * Method peek, which returns the top element of the array without removing it from the list.
     * @return  top element of array
     */
    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty! No element to peek.");
            return (T) "empty";
        } else {
            System.out.println("Element peeked: " + array[top]);
            return array[top];
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

    /**
     * Method list, which lists all the elements followed by a ";".
     */
    public void list() {
        String text = "";
        for (int i = 0; i < top + 1; i++) {
            text += array[i] + "; ";
        }
        System.out.println(text);
    }
}
