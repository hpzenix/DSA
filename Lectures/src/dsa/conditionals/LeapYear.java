package dsa.conditionals;

// Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // taking input
        System.out.print("Enter a year : ");
        int n = in.nextInt();

        if (n%400 == 0) {
            System.out.println(n + " is a leap year");
        }
        else if (n%100 == 0) {
            System.out.println(n + " is not a leap year");
        }
        else if (n%4 == 0) {
            System.out.println(n + " is a leap year");
        }
        else {
            System.out.println(n + " is not a leap year");
        }
    }
}
