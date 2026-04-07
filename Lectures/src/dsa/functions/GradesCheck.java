package dsa.functions;

import java.util.Scanner;

public class GradesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        String Result = marks_grade(marks);
        System.out.println("Grades obtainted are : " + Result);
    }

    static String marks_grade(int marks){
        if (marks > 90 && marks <= 100){
            return "S";
        }
        else if (marks > 80 && marks <= 90){
            return "A";
        }
        else if (marks > 70 && marks <= 80){
            return "B";
        }
        else if (marks > 60 && marks <= 70){
            return "C";
        }
        else if (marks > 50 && marks <= 60){
            return "D";
        }
        else if (marks > 40 && marks <= 50){
            return "E";
        }
        else{
            return "Fail";
        }
    }
}
