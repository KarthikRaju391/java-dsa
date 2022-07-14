package functions.theory;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int num = in.nextInt();
        System.out.print("Enter the limit: ");
        int num2 = in.nextInt();
        for(int i = num; i < num2; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n) {
       if(n <= 1) {
           return false;
       }
       int c = 2;
       while(c * c <= n) {
           if(n % c == 0) {
               return false;
           }
           c++;
       }
       return c * c > n; // returns true or false
    }
}
