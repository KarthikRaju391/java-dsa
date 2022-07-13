package functions.exercises;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = in.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = in.nextInt();
        System.out.print("Enter third number: ");
        int thirdNum = in.nextInt();

        int maximum = getMax(firstNum, secondNum, thirdNum);
        int minimum = getMin(firstNum, secondNum, thirdNum);

        System.out.println("The maximum value is: " + maximum);
        System.out.println("The mininum value is: " + minimum);
    }
    static int getMax(int a, int b, int c) {
        int max = a;

        if(b > max) {
            max = b;
        } else if (c > b) {
            max = c;
        }
       return max;
    }
    static int getMin(int a, int b, int c) {
        int min = a;

        if(b < min) {
            min = b;
        } else if (c < b) {
            min = c;
        }
        return min;
    }
}
