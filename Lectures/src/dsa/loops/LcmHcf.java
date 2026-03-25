package dsa.loops;

import java.util.Scanner;

// Take 2 numbers as inputs and find their HCF and LCM

public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two munbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int HCF = 0;
        int LCM = 0;

        // finding HCF
        int a = num1;
        int b = num2;

        /*
        // Method-1
        int n = a > b ? b : a; // set n to smallest of two numbers
        while (n>0) {
            if (a%n == 0 && b%n ==0) {
                HCF = n;
                break;
            }
            n--;
        }
        */

        // Method-2
        int temp;
        while(b>0){
            temp = b;
            b = a%b;
            a = temp;
        }
        HCF = a;


        // finding LCM
        /*
        // Method-1
        LCM = num1 * num2 / HCF;
        */

        // Method-2
        int n = Math.max(num1,num2);
        int m = Math.min(num1,num2);
        int t,i = 1;
        while(true) {
            if (n*i % m == 0) {
                break;
            }
            i++;
        }
        LCM = n*i;

        System.out.println("HCF of two numbers is : " + HCF);
        System.out.println("LCM of two numbers is : " + LCM);
    }
}
