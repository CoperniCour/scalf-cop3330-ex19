/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 19 - BMI calculator

package org.example;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        //Prompt user for height and weight
        Scanner getInfo = new Scanner(System.in);

        System.out.print("Enter your weight, in pounds: ");
        double weight = getInfo.nextDouble();

        System.out.print("Enter your height, in inches: ");
        double height = getInfo.nextDouble();

        //Calculate BMI of user
        double bmi = (weight / (height*height)) * 703;

        //if, else if, else statements based on BMI of user
        if (bmi >= 18.5 && bmi <= 25) {
            // if healthy weight
            System.out.println(String.format("Your BMI is %.02f.", bmi));
            System.out.println("You are within the ideal weight range.");

        } else if (bmi > 18.5) {
            // overweight
            System.out.println(String.format("Your BMI is %.02f.", bmi));
            System.out.println("You are overweight. You should see your doctor.");
        } else {
            // underweight
            System.out.println(String.format("Your BMI is %.02f.", bmi));
            System.out.println("You are underweight. You should see your doctor.");
        }
    }
}
