package com.exercises;
import java.util.Scanner;

public class EvenOrOdd {
    //TODO
    public static void main(String[] args) {
        // Take input from user
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        // Check if the number is odd or even
        if(userInput % 2 == 0) {
            System.out.println("Number " + userInput + " is even");
        } else {
            System.out.println("Number " + userInput + " is odd");
        }
        // return the same
    }
}
