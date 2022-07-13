package functions.exercises;

public class PalindromeCheck {
    public static void main(String[] args) {
        boolean result = isPalindrome(1001);
        System.out.println(result);
    }

    static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        while(num != 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return original == reversed;
    }
}
