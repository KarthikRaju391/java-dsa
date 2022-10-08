package Cognizant;

import java.util.Objects;
import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tickets: ");
        int tickets = sc.nextInt();
        System.out.println("Do you want refreshment? (y/n)");
        String refreshment = sc.next();
        System.out.println("Do you have a coupon code? (y/n)");
        String coupon = sc.next();
        System.out.println("Enter the circle: (k/q)");
        String circle = sc.next();

        if(tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
            System.exit(0);
        }


        float totalCost = 0;
        if(circle.charAt(0) == 'k') {
            totalCost = 75 * tickets;
        } else if(circle.charAt(0) == 'q') {
            totalCost = 150 * tickets;
        } else {
            System.out.println("invalid input");
            return;
        }

        if(tickets > 20) {
            totalCost = (float) (totalCost - (0.1 * totalCost));
        }
        if(coupon.charAt(0) == 'y') {
            totalCost = (float) (totalCost - (0.02 * totalCost));
        }

        if(refreshment.charAt(0) == 'y') {
            totalCost = totalCost + (tickets * 50);
        }

        System.out.println(totalCost);
    }
}
