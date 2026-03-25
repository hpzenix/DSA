package dsa.conditionals;

import java.util.Scanner;

public class Maxof3nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three no.s : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        // Method 1
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest of 3 numbers");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the greatest of 3 numbers");
        } else {
            System.out.println(num3 + " is the greatest of 3 numbers");
        }


        // Method 2
        int max = Math.max(num1,Math.max(num2,num3));
        System.out.println(max + " is the greatest of 3 numbers");


        // Method 3
        int maximum = num1;
        if (num2 > maximum) {
            maximum = num2;
        }
        if (num3 > maximum){
            maximum = num3;
        }
        System.out.println(maximum + " is the greatest of 3 numbers");
    }
}
