package dsa.loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*
        // ---> Method-1
        for (int i = 1; i <= n ; i++) {
            if (n%i == 0){
                System.out.println(i);
            }
        }
        */

        // ---> Method-2
        for (int i = 1; i*i <= n ; i++) {
            if (n%i == 0){
                if (i == n/i){
                    System.out.println(i);
                }
                else {
                    System.out.println(i);
                    System.out.println(n/i);
                }
            }
        }
    }
}
