

/*
 *  UCF COP3330 Summer 2021 Assignment 13
 *  Copyright 2021 Steven Ortiz
 */

//What is the principal amount? 1500
//What is the rate? 4.3
//What is the number of years? 6
//What is the number of times the interest is compounded per year? 4
//$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
package org.example;

import java.util.Scanner;

import java.text.DecimalFormat;

public class App {

    static Scanner in = new Scanner(System.in);

    private static double initial(){

        System.out.print("What is the principal amount? ");

        return in.nextDouble();
    }

    private static double rate(){

        System.out.print("What is the rate? ");

        return in.nextDouble();
    }

    private static double years(){

        System.out.print("What is the number of years? ");

        return in.nextDouble();
    }

    private static double compound(){

        System.out.print("What is the number of times the interest is compounded per year? ");

        return(double) in.nextDouble();

    }
    public static void main(String[] args){

        double initial = initial();

        double rate = rate();

        double years = years();

        double compound = compound();

        double percent = rate / 100.0;

        double baseNumber = (1+(percent/compound));

        double expNumber = (compound*years);

        double finalansw= Math.pow(baseNumber,expNumber);

        double investmentr = (initial*finalansw) * 100.0;

        double rater = (double) Math.ceil(investmentr);

        double  ratef = rater/100.0;

        System.out.print("$"+String.format("%.0f",initial)+" invested at "+String.format("%.2f",rate)+
                "% for "+String.format("%.0f",years)+" years compounded "+String.format("%.0f",+compound)+
                " times per year is $"+String.format("%.2f",+ratef));


    }
}