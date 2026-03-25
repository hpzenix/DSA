package dsa.functions;

import java.util.Scanner;

public class SI_CI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter values of p,r,t,n :");
        float p = in.nextFloat();
        float r = in.nextFloat();
        float t = in.nextFloat();
        int n = in.nextInt();

        SI(p,r,t);
        CI(p,r,t,n);

    }

    static void CI(float p, float r, float t, int n) {
        double CI = p * Math.pow( ( 1 + (r / (100*n) ) ), n*t );
        System.out.println("Total Amount = " + CI + " & Compound Interest = " + (CI-p));
    }

    static void SI(float p, float r, float t) {
        double SI = p*r*t/100;
        System.out.println("Total Amount = " + (p+SI) + " & Simple Interest = " + SI);
    }
}
