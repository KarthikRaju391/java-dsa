package Cognizant;

import java.util.Arrays;
import java.util.HashMap;

public class DecimalToX {
    public static void main(String[] args) {
//        System.out.println(convertToBinary(7));
//        System.out.println(covertToDecimal(1010));
//        System.out.println(decimalToOctal(78));
//        System.out.println(octalToDecimal(116));
//        System.out.println(hexToDecimal("C9"));
        System.out.println(decimalToHex(1457));
    }

    static int hexToDecimal(String hex) {
        String digits = "0123456789ABCDEF";
        int val = 0;
        for(int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }
    static int decimalToOctal(int num) {
        int octal = 0;
        int i = 1;
        while(num != 0) {
            int n = num % 8;
            octal += n * i;
            num /= 8;

            i *= 10;
        }

        return octal;
    }

    static int convertToBinary(int num) {
        int binary = 0;
        int i = 1;
        while(num != 0) {
            int n = num % 2;
            binary += n * i;
            num /= 2;

            i *= 10;
        }

        return binary;
    }

    static String decimalToHex(int num) {
        StringBuilder hexa = new StringBuilder();
        while(num != 0) {
            int n = num % 16;
            if(n < 10) {
                hexa.append((char)(n + 48)); // ASCII(0) = 48
            } else {
                hexa.append((char)(n + 55)); // ASCII(A) = 55
            }
            num /= 16;
        }
        return hexa.reverse().toString();
    }
    static int covertToDecimal(int num) {
        int decimal = 0;
        int i = 0;
        while(num != 0) {
            int n = num % 10;
            decimal += n * Math.pow(2, i);
            num /= 10;

            i++;
        }
        return decimal;
    }
    static int octalToDecimal(int num) {
        int decimal = 0;
        int i = 0;
        while(num != 0) {
            int n = num % 10; // get the unit digit
            decimal += n * Math.pow(8, i);
            num /= 10; // ignore the unit digit (reduce the number of digits)
            i++;
        }
        return decimal;
    }
}
