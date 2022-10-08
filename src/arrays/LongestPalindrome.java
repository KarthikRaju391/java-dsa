package arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        int[] arr = { 121, 2322, 54545, 999990 };
        System.out.println(findLongestPalindrome(arr));
    }

    static int findLongestPalindrome(int[] arr) {
        int len = (int)Math.log10(arr[0]) + 1;
        int longestPalindrome = 0;
        for(int i = 1; i < arr.length; i++) {
            int newLen = (int)Math.log10(arr[i]) + 1;
            if(checkPalindrome(arr[i]) && newLen > len) {
                len = newLen;
                longestPalindrome = arr[i];
            }
        }

        return longestPalindrome;
    }

    static boolean checkPalindrome(int n) {
        int num = n;
        int reverse = 0;

        while(n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        return reverse == num;
    }
}
