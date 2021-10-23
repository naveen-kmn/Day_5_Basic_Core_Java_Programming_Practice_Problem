package com.blp.basiccorejavaprogram;

import java.text.MessageFormat;
import java.util.Scanner;

public class LargestAmongThreeNumbers
{
    public static void main(String[] args)
    {
        double n1,n2,n3;
        Scanner num = new Scanner (System.in);

        System.out.println("Enter three numbers: ");
        n1 = num.nextDouble();
        n2 = num.nextDouble();
        n3 = num.nextDouble();
        System.out.println(MessageFormat.format("Entered numbers:{0},{1},{2}", n1, n2, n3));

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
