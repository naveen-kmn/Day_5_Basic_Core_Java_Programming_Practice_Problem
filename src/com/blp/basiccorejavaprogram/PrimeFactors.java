package com.blp.basiccorejavaprogram;

import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=inp.nextInt();

        PrimeFactors rpf=new PrimeFactors();
        rpf.factor(num);
    }

    void factor(int num)
    {
        System.out.print("The factors are :");
        for (int i = 2; i <= num; i++)
        {
            while (num % i == 0)
            {
                System.out.print(i + " ");
                num = num / i;
            }
        }
    }
}

