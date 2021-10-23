package com.blp.basiccorejavaprogram;

import java.util.Scanner;

public class HarmonicNumber
{
    public static void main(String[] args)
    {
            double num,i,sum=0;

            Scanner h=new Scanner(System.in);
            System.out.println("Enter a number");
            num=h.nextDouble();

            for( i=1;i<=num;i++)
            {
                sum=sum+(1/i);
            }
            System.out.println("Harmonic value = "+sum);
    }

}