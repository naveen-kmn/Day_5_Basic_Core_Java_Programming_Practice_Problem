package com.blp.basiccorejavaprogram;

import java.text.MessageFormat;
import java.util.Scanner;

public class PowerOfTwo
{
    void display(int num)
    {
        if (num < 31)
        {
            int powerOfTwo;

            for (int i = 0; i <= num; i++)
            {
                powerOfTwo = (int) Math.floor(Math.pow(2, i));

                System.out.println(MessageFormat.format("{0} power of 2 = {1}", +i, powerOfTwo));
            }
        }
        else
            System.out.println("Number Exceed");
    }
    public static void main(String[] args)
    {

        Scanner e = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = e.nextInt();

        PowerOfTwo pow = new PowerOfTwo();
        pow.display(num);
    }
}
