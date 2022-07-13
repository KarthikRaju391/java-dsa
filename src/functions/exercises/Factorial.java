package functions.exercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to get the factorial of it: ");
        int val = in.nextInt();
        int result = getFactorial(val);
        System.out.println("Factorial of the given number is " + result);
    }
    static int getFactorial(int num) {
        int factorial = 1;
        for(int i = num; i > 1; i--) {
           factorial *= i;
        }
        return factorial;
    }
}
