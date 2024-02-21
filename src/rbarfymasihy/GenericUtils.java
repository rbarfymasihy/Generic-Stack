package rbarfymasihy;

/**
 * This class contains the methods for a generic utility class.
 * @author rbarfymasihy
 * @version 20.02.2024
 */

public class GenericUtils {
    /**
     * Method reverse, which reverses the elements of an array.
     * @param array array to be reversed
     * @param <T>   generic type
     * @param <T>   generic type
     */
    public static <T> void reverse(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {    //Swapping the elements of the array
            T temp = array[i];  //Temporary variable to store the current element
            array[i] = array[array.length - i - 1]; //Swapping the current element with the corresponding element from the end of the array
            array[array.length - i - 1] = temp; //Swapping the corresponding element from the end of the array with the current element
        }
    }

    /**
     * Method sum, which sums up the elements of an array.
     * @param array array to be summed up
     * @param <T>   generic type
     */
    public static <T extends Number> double sum(T[] array) {  //The generic type T must be a subclass of Number
        double sum = 0.0;    //Variable to store the sum of the elements
        for (int i = 0; i < array.length; i++) {    //Iterating through the array
            sum += array[i].doubleValue();  //Adding the current element to the sum
        }
        return sum; //Returning the sum
    }
}
