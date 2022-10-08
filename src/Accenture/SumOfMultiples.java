package Accenture;

import java.util.Scanner;

public class SumOfMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = getMultiples(num);
        System.out.println(sum);
    }

    static int getMultiples(int n) {
        int sumOfMultiples = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            sumOfMultiples += n * i;
        }
        return sumOfMultiples;
    }
}
