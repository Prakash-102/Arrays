
//Reverse order ?:- 
import java.util.*;

public class Reverse {

    public static void reverse(int numbers[]) {
        int first = 0, Last = numbers.length - 1;
        while (first < Last) {
            int temp = numbers[Last];
            numbers[Last] = numbers[first];
            numbers[first] = temp;
            first++;
            Last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
/*
 * Output:-
 * reverse = 16 14 12 10 8 6 4 2
 */
