package dsa.loops;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        /*
        // Method 1
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        */
        System.out.print(a + " ");
        System.out.print(b + " ");

        // Method 2
        for (int i = 2; i < n ; i++) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(b + " ");
        }
    }
}
