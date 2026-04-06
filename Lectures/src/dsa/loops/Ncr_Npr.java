package dsa.loops;

import java.util.Scanner;

public class Ncr_Npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and r :");
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n <= 0 || r<0 || n<r){
            System.out.println("Enter valid numbers");
        }
        int Ncr = 0;
        int Npr = 0;
        int F1 = 1;
        int F2 = 1;
        for (int i = 1; i <= r ; i++) {
            F1 *= i;
        }
        for (int i = n-r+1 ; i <= n ; i++) {
            F2 *= i;
        }
        Npr = F2;
        Ncr = F2/F1;
        System.out.println("Ncr : " + Ncr);
        System.out.println("Npr : " + Npr);
    }
}
