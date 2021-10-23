package com.blp.basiccorejavaprogram;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FlippingCoin
{
        public static void main(String[] args)
        {
            int heads = 0;
            int tails = 0;
            int counter = 1;
            double randNum;

            Scanner in = new Scanner(System.in);
            System.out.println("How many times will the coin be flipped? ");
            int flips = in.nextInt();

            while(counter <= flips)
            {
                randNum = Math.random();
                System.out.print(counter + "  " + new DecimalFormat("#.##").format(randNum));

                if(randNum < .5)
                {
                    heads++;
                    System.out.println("\t heads");
                }
                else
                {
                    tails++;
                    System.out.println("\t tails");
                }
                counter++;
            }
            System.out.println();
            System.out.println("Number of Heads = " + heads);
            System.out.println("Number of Tails = " + tails);
            int i = (100 * heads) / flips;
            int j = (100 * tails) / flips;
            System.out.println("Percentage of Heads = "+i+"%");
            System.out.println("Percentage of Heads = "+j+"%");
        }
}