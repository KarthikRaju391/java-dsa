package Cognizant;

public class LeastDiscount {
    public static void main(String[] args) {
        int res = countSetBit(2);
        System.out.println(res);
    }

    static int countSetBit(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            int bin = convertBinary(i);
            while(bin != 0) {
               int digit = bin % 10;
               if(digit == 1) {
                  count++;
               }
               bin /= 10;
            }
        }
        return count;
    }

    static int convertBinary(int num) {
        int j = 1;
        int binary = 0;

        while(num != 0) { // num = 5 -> 2 -> 1
            int n = num % 2; // remainder = 1 -> 0 -> 1
            binary += n * j; // 0 + 1 = 1 -> 1 + 0 * 10 = 1 -> 1 + 1 * 100 = 101
            j = j * 10; // j = 10 -> 100 -> 1000;
            num /= 2; // updated num = 2 -> 1 -> 0;
        }

        return binary;
    }
}
