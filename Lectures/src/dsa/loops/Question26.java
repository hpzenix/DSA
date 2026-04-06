package dsa.loops;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pe_sum = 0;
        int po_sum = 0;
        int n_sum = 0;

        while(true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            else if (n < 0) {
                n_sum += n;
            }
            else if ((n > 0) && (n%2==0)) {
                pe_sum += n;
            }
            else {
                po_sum += n;
            }
        }
        System.out.println("Negative sum : " + n_sum);
        System.out.println("Positive even sum : " + pe_sum);
        System.out.println("Positive odd sum : " + po_sum);
    }
}
