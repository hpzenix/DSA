package dsa.loops;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many semesters you have passed : ");
        int n = sc.nextInt();
        if (n > 8 || n < 1) {
            System.out.println("enter valid number");
        }
        System.out.print("does all sem has same credits?(y/n) : ");
        char s = sc.next().charAt(0);
        float cgpa = 0;
        if (s == 'y') {
            float sum = 0;
            int count = 0;
            System.out.println("Enter sgpa one by one");
            while(count < n){
                float sgpa = sc.nextFloat();
                sum += sgpa;
                count++;
            }
            cgpa = sum / n;
        }
        else if (s == 'n') {
            float sum = 0;
            int total_credit = 0;
            System.out.println("Enter sgpa & credits one by one");
            while (n > 0){
                float sgpa = sc.nextFloat();
                int credit = sc.nextInt();
                sum = sum + sgpa * credit;
                total_credit = total_credit + credit;
                n--;
            }
            cgpa = sum / total_credit;
        }
        else {
            System.out.println("enter valid value!!");
        }
        System.out.println("CGPA : " + cgpa);
    }
}
