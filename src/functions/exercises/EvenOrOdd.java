package functions.exercises;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userVal = in.nextInt();
       String result = isEvenOrOdd(userVal);
       if(result.equals("even")){
           System.out.printf("The given number %d is %s ", userVal, result);
       } else {
           System.out.printf("The given number %d is %s", userVal, result);
       }
    }
    static String isEvenOrOdd(int value) {
        if(value % 2 == 0) {
            return "even";
        }else {
            return "odd";
        }
    }
}
