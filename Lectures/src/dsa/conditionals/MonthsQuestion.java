package dsa.conditionals;

import java.util.Scanner;

// --> Important Concept
//  [==] compares memory references (addresses), not values. Whereas [.equalto()] compares values/content.

public class MonthsQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m_days = 0;
        System.out.print("Enter 1st 3 letters of a month :  ");
        String m = sc.next().toLowerCase().substring(0,3);
        if ((m.equals("jan")) || (m.equals("mar")) || (m.equals("may")) || (m.equals("jul")) || (m.equals("aug")) || (m.equals("oct")) || (m.equals("dec"))){
            m_days = 31;
        }
        else if (m.equals("feb")){
            m_days = 28;
        }
        else if (m.equals("apr") || m.equals("jun") || m.equals("sep") || m.equals("nov")) {
            m_days = 30;
        }
        else {
            System.out.println("invalid entry");
            return;
        }
        System.out.println("No. of days thor can play is : " + m_days/2);
    }
}
