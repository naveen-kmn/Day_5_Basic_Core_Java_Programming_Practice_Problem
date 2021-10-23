package com.blp.basiccorejavaprogram;

import java.text.MessageFormat;
import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        Scanner eo = new Scanner(System.in);
        int num = eo.nextInt();
        EvenOrOdd number = new EvenOrOdd();
        number.check(num);
    }

    void check(int num)
    {
        int a = num % 2; // % is for Remainder
        if (a == 0)
        {
            System.out.println(MessageFormat.format("{0} is even number", +num));
        }
        else
            System.out.println(MessageFormat.format("{0} is odd number", +num));
    }
}
