package com.blp.basiccorejavaprogram;

import java.util.Scanner;

public class QuotientAndRemainder
{
    public static void main(String[] args)
    {
        Scanner qr = new Scanner(System.in);
        System.out.println("Enter divident:");
        int x = qr.nextInt();
        System.out.println("Enter divisor:");
        int y = qr.nextInt();
        calculateQuotientAndReminder(x, y);
    }
    static void calculateQuotientAndReminder(int x, int y)
    {
        System.out.println("Quotient = " + (x / y));
        System.out.println("Reminder = " + (x % y));

    }
}
