package Cognizant;

import java.util.Scanner;

public class MonthToSeasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Month: ");
        int month = sc.nextInt();

        if(month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else {
            if(month == 12 || month <= 2) {
                System.out.println("Winter");
            } else if (month <= 5) {
                System.out.println("Spring");
            } else if(month <= 8) {
                System.out.println("Summer");
            } else {
                System.out.println("Autumn");
            }
        }
    }
}
