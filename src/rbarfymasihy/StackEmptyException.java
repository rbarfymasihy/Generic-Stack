package rbarfymasihy;

/** This class contains the methods for a stack full exception.
 * @author rbarfymasihy
 * @version 20.02.2024
 */
public class StackEmptyException extends Exception {
    public StackEmptyException() {
        super("The stack is empty!");
    }
}
