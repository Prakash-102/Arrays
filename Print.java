
//Print Subarrays ?:- 
import java.util.*;

public class Print {

    public static void printSubarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // print
                    System.out.print(numbers[k] + " "); // subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        printSubarrays(numbers);
    }
}
/*
 * Output:-
 * 2
 * 2 4
 * 2 4 6
 * 2 4 6 8
 * 2 4 6 8 10
 * 2 4 6 8 10 12
 * 2 4 6 8 10 12 14
 * 2 4 6 8 10 12 14 16
 * 
 * 4
 * 4 6
 * 4 6 8
 * 4 6 8 10
 * 4 6 8 10 12
 * 4 6 8 10 12 14
 * 4 6 8 10 12 14 16
 * 
 * 6
 * 6 8
 * 6 8 10
 * 6 8 10 12
 * 6 8 10 12 14
 * 6 8 10 12 14 16
 * 
 * 8
 * 8 10
 * 8 10 12
 * 8 10 12 14
 * 8 10 12 14 16
 * 
 * 10
 * 10 12
 * 10 12 14
 * 10 12 14 16
 * 
 * 12
 * 12 14
 * 12 14 16
 * 
 * 14
 * 14 16
 * 
 * 16
 */
