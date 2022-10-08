package functions.exercises;

import java.util.Scanner;

public class FirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        int result = getFirstNOpt(num);
        System.out.println(result);
    }
    static int getFirstN(int n){
       int sum = 0;
       for(int i = n; i > 0; i--) {
          sum += i;
       }
       return sum;
    }

    static int getFirstNOpt(int n) {
        return n * (n + 1) / 2;
    }
}
