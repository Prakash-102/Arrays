
//Largest and Smallest value ?:- 
import java.util.*;

public class Classroom {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        System.out.println("largest value is : " + getLargest(numbers));
    }
}
/*
 * Output:-
 * Smallest value is : 2
 * largest value is : 16
 */
