package Accenture;

public class CarryCount {
    public static void main(String[] args) {
        System.out.println(carryCount(4899, 3481));
    }

    static int carryCount(int num1, int num2) {
        int carry = 0;
        int count = 0;

        while(num1 != 0 || num2 != 0) {
            int rem;
            if(carry == 1) {
                rem = carry + num1 % 10 + num2 % 10;
            } else {
                rem = num1 % 10 + num2 % 10;
            }
            if(rem >= 10) {
                count++;
                carry = 1;
            }
            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }
}
