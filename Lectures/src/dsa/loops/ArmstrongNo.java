package dsa.loops;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int d = 0;

        // ---- for number in   range of fixed number of digits

        // counting number of digits
        /*
            // M-1
            int t = n;
            while(t>0){
                t = t/10;
                d++;
            }
            */

        // M-2
        if(n1==0){
            d=1;
        } else {
            d = (int) Math.log10(n1) + 1;
        }


        for (int i = n1; i <= n2 ; i++) {
            int sum = 0;
            int j = i;
            while(j>0) {
                int rem = j % 10;
                sum = sum + (int)Math.pow(rem, d);
                j = j / 10;
            }
            if (i == sum) {
                System.out.println( i + " is Armstrong No.");
            }
        }
    }
}
