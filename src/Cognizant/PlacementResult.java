package Cognizant;

import java.util.Scanner;

public class PlacementResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of students placed in CSE: ");
        int cse = sc.nextInt();
        System.out.println("Enter the no. of students placed in ECE: ");
        int ece =sc.nextInt();
        System.out.println("Enter the no. of students placed in MECH: ");
        int mech = sc.nextInt();

        if(cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("Highest Placement: ");
        if(ece == cse && cse > mech) {
            System.out.println("CSE");
            System.out.println("ECE");
        } else if(ece == mech && mech > cse) {
            System.out.println("ECE");
            System.out.println("MECH");
        } else if(cse == mech && cse > ece) {
            System.out.println("CSE");
            System.out.println("MECH");
        } else if(cse > ece && cse > mech) {
            System.out.println("CSE");
        } else if(ece > cse && ece > mech) {
            System.out.println("ECE");
        } else {
            System.out.println("MECH");
        }
    }
}
