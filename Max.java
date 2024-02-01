
//Max Subarray Sum-1(Brute Force) ?:- 
import java.util.*;

public class Max {

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = 0; k <= end; k++) { // print
                    // Subarray Sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubarraySum(numbers);
    }
}
/*
 * Output:-
 * 2
 * 6
 * 12
 * 20
 * 30
 * 6
 * 12
 * 20
 * 30
 * 12
 * 20
 * 30
 * 20
 * 30
 * 30
 * Max Sum = 30
 */
