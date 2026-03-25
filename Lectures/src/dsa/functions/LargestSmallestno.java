package dsa.functions;

import java.util.Scanner;

public class LargestSmallestno {

    static int largest(Integer n){
        String s = n.toString();
        int largest = 0;
        int max1 = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int original = n;
            int max2=0;
            while (original>0){
                int rem = original%10;
                if (rem > max2 && rem < max1){
                    max2 = rem;
                }
                original = original/10;
            }
            largest = largest * 10 + max2;
            max1 = max2;
        }
        return largest;
    }

    static int smallest(Integer n){
        String s = n.toString();
        int smallest = 0;
        int min1 = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int original = n;
            int min2=100;
            while (original>0){
                int rem = original%10;
                if (rem < min2 && rem > min1){
                    min2 = rem;
                }
                original = original/10;
            }
            smallest = smallest * 10 + min2;
            min1 = min2;
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        Integer n = in.nextInt();
        if (n<0){
            System.out.println("Largest Number is : -" + smallest(-n));
            System.out.println("Smallest Number is : -" + largest(-n));
        } else {
            System.out.println("Largest Number is : " + largest(n));
            System.out.println("Smallest Number is : " + smallest(n));
        }
    }
}
