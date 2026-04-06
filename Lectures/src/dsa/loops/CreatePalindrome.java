package dsa.loops;

import java.util.Scanner;

public class CreatePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String palindrome = s;
        for (int i = s.length() - 2; i >= 0; i--) {
            palindrome = palindrome + s.charAt(i);
        }
        System.out.println(palindrome);
    }
}

