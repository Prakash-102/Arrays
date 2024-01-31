
//Binarysearch ?:- 
import java.util.*;

public class Binarysearch {

    public static int binarysearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparise
            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        System.out.println(binarysearch(numbers, key));
    }
}
/*
 * Output:-
 * length = 4
 */
