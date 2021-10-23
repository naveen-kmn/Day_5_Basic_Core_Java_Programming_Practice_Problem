package com.blp.basiccorejavaprogram;

import java.util.Scanner;

public class SwapingTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = s.nextInt();
        System.out.print("Enter second number: ");
        int y = s.nextInt();
        System.out.println("Before swaping:x="+x+", y=" + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:x="+x+", y=" + y);

    }
}
