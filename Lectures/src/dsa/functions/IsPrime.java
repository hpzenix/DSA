package dsa.functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to find? \n" +
                "1. Prime no. in range \n" +
                "2. Armstrong no. in range");
        int input = in.nextInt();
        if(input == 1){
            System.out.println("Enter the range of numbers : ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            for (int i = n1; i <= n2 ; i++) {
                if(isPrime(i)){
                    System.out.print(i + ", ");
                }
            }
        }
        else if (input == 2) {
            System.out.println("Enter the range of numbers: ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            for (int i=n1; i<=n2; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + ", ");
                }
            }
        }

    }

    // Print armstrong no.
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int d = (int) (Math.log10(n) + 1);
        while (n>0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + (int)(Math.pow(rem,d));
        }
        return sum == original;
    }

    // check prime no. or not
    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
