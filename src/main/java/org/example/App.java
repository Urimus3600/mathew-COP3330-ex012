/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static double ceilMoney(double raw){
        return Math.ceil(raw*100)/100.0;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double P = input.nextDouble();
        System.out.print("Enter the rate as a percentage: ");
        double r = input.nextDouble()/100.0;
        System.out.print("Enter the number of years: ");
        double t = input.nextDouble();

        double A = ceilMoney(P*(1+r*t));

        System.out.print("After " + t + " years at " + r*100 +"%, the investment will be worth $");
        System.out.printf("%.2f.", A);



    }
}
