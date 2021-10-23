package com.blp.basiccorejavaprogram;

import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args)
    {
        System.out.println("Enter the alphabet");
        Scanner vc = new Scanner(System.in);
        char ch = vc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}