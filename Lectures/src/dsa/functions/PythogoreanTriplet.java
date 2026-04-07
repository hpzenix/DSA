package dsa.functions;

import java.util.Scanner;

public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of triplets : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<=0 || b<=0 || c<=0){
            System.out.println("Invalid numbers !!");
            return;
        }
        boolean flag = Pythogorean_Triplet_check(a, b, c);
        if(flag){
            System.out.println("(" + a + ", " + b + ", " + c + ") is a Pythogorean Triplet");
        }
        else{
            System.out.println("(" + a + ", " + b + ", " + c + ") is not a Pythogorean Triplet");
        }
    }

    static boolean Pythogorean_Triplet_check(int a, int b, int c) {
        int max = largest(a,b,c);
        if(max == a){
            return (a*a) == (b*b) + (c*c);
        }else if(max == b){
            return (b*b) == (b*b) + (a*a);
        }else if(max == c){
            return (c*c) == (b*b) + (a*a);
        }
        return false;
    }

    static int largest(int a, int b, int c){
        if(a>b && a>c){
            return a;
        } else if (b>c) {
            return b;
        }else {
            return c;
        }
    }
}
