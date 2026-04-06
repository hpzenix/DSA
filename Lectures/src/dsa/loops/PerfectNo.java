package dsa.loops;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int j = 1; j <= 10000 ; j++) {
            int sum = 0;
            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j){
                System.out.println(j);
            }
        }
    }
}
