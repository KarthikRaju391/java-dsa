package Cognizant;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(convertToBinary(7));
        System.out.println(covertToDecimal(1010));
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

    static int convertToOctal(int num) {
        int octal = 0;
        int i = 0;
        while(num != 0) {
            int n = num % 8;
            octal += n * i;
            num /= 2;
            i *= 10;
        }
        return octal;
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
}
