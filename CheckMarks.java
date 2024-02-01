
//Arrays-input, output & update ?:- 
import java.util.*;

public class CheckMarks {

    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
    }
}
/*
 * Enter Marks
 * 98
 * 65
 * 87
 * Output:-
 * phy : 98
 * chem : 65
 * math : 87
 * percentage = 83%
 */
