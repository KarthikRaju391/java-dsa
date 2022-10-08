package Cognizant;

import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        if((int)(Math.log10(num) + 1) < 4) {
            System.out.println("Invalid number");
        } else {
            int sum = 0;
            while(num != 0) {
                int n = num % 10;
                sum += n;
                num /= 10;
            }
            if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                System.out.println("Lucky Number!");
            } else {
                System.out.println("Sorry, it is not my lucky number");
            }
        }
    }
}
