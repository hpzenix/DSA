package dsa.loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value : ");

        /*
        // Method-1 (only for numbers)
        int n = in.nextInt();
        int original = n;
        int reverse = 0;
        while (n>0) {
            int rem = n%10;
            reverse = reverse * 10 + rem;
            n=n/10;
        }
        if (reverse == original) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
        */

        // Method-2
        String s = in.next();
        int n = s.length();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n-1-i)){
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
