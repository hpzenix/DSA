package dsa.conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the operator : ");
        char op = in.next().trim().charAt(0);
        float ans = 0;

        if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
            System.out.println("Enter two numbers: ");
            float num1 = (float)in.nextInt();
            float num2 = (float)in.nextInt();

            if (op == '+'){
                ans = num1 + num2;
            }

            if (op == '-'){
                ans = num1 - num2;
            }

            if (op == '*'){
                ans = num1 * num2;
            }

            if (op == '/'){
                if (num2 != 0){
                    ans = num1 / num2;
                } else {
                    System.out.println("Denominator can't be zero");
                }
            }

            if (op == '%'){
                ans = num1 % num2;
            }
        System.out.println("Answer is : " + ans);
        } else {
            System.out.println("Invalid Operation!!");
        }
    }
}
