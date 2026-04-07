package dsa.functions;

import java.util.Scanner;



public class Largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        Largest(n1, n2, n3);
        Smallest(n1, n2, n3);
    }

    static void Largest(int n1, int n2, int n3) {
        if(n1 > n2 && n1 > n3){
            System.out.println("Largest is : " + n1);
        }
        else if (n2 > n3) {
            System.out.println("Largest is : " + n2);
        } else {
            System.out.println("Largest is : " + n3);
        }
    }

    static void Smallest(int n1, int n2, int n3) {
        if(n1 < n2 && n1 < n3){
            System.out.println("Smallest is : " + n1);
        }
        else if (n2 < n3) {
            System.out.println("Smallest is : " + n2);
        } else {
            System.out.println("Smallest is : " + n3);
        }
    }
}
