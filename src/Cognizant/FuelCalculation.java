package Cognizant;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelCalculation {
    // Calculating fuel efficiency
    // input: 1. Quantity of fuel 2. Distance covered till tank is empty
    // output: Display it in the format of "litres per 100 Kilometers"
    // Convert to U.S style of miles per gallon
    // FORMULA TO CALCULATE EFFICIENCY
    // 20L --> 150KM
    // X --> 100KM
    // X = (100 * 20) / 150
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel in litres: ");
        int l = sc.nextInt();
        System.out.println("Enter the distance covered: ");
        int d = sc.nextInt();
        if(l < 0 || d < 0) {
            System.out.println("Please enter valid input!");
            System.exit(0);
        }
        float res = (float)(100 * l) / d;

        double miles = d * 0.6214;
        double gallons = l * 0.2642;

        double mg = miles/gallons;

        System.out.printf("%.2f", res);
        System.out.println();
        System.out.printf("%.2f", mg);
    }
}
