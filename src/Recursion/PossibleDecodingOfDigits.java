package Recursion;

public class PossibleDecodingOfDigits {
    public static void main(String[] args) {
        char[] arr = {'1', '3', '1'};
        System.out.println(decode(arr.length, arr));
    }

    static int decode(int n, char[] digits) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int count = 0;
        if(digits[n-1] > '0') {
            count = decode(n-1, digits);
        }
        if(digits[n-2] == '1' || (digits[n-2] == '2' && digits[n-1] < '7'))  {
            count += decode(n-2, digits);
        }
        return count;
    }
}
