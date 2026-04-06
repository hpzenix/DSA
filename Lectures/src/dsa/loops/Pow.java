package dsa.loops;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = sc.nextInt();
        long pow = sc.nextInt();
        long result = 1;

        /*
        // ---> M-1
        for (int i = 0; i < pow; i++) {
            result = result * base;
        }
        */

        // M-2
        while(pow > 0){
            if (pow % 2 == 1){
                result = result * base;
            }
            base = base * base;
            pow = pow / 2;
        }

        System.out.println(result);
    }
}
