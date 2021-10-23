package com.blp.basiccorejavaprogram;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner e = new Scanner(System.in);
        System.out.println("Enter the year ");
        int year = e.nextInt();

        LeapYear refyear = new LeapYear();
        refyear.display(year);
    }

        void display(int year)
        {
        if (year % 4 == 0)
        {
            System.out.println(+year+"Year is leap year");
        }
        else
            System.out.println(+year+"Year is not leap year");
    }
}
