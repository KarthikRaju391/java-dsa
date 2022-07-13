package com.theory;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the celsius value
        float tempC = input.nextInt();
        // Convert the celsius value to fahrenheit
        float tempF = (tempC * 9/5) + 32;
        // print the fahrenheit value
        System.out.println("The temperature in fahrenheit is: " + tempF);
    }
}