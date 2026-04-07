package dsa.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n & r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n<r || r<0 || n<=0){
            System.out.println("Invalid entry of 'n' or 'r' ");
        }
        int nCr = factorial(n, n-r) / factorial(r , 0);
        int nPr = factorial(n, n-r);
        System.out.println("nCr = " + nCr);
        System.out.println("nPr = " + nPr);
    }

    static int factorial(int n , int t){
        int factorial = 1;
        for (int i = n; i > t ; i--) {
            factorial *= i;
        }
        return factorial;
    }

}
