package Capgemini;

public class LCM {
    public static void main(String[] args) {
//        System.out.println(LCM(12, 15));
        System.out.println(GCD(144, 32));
    }

    static int LCM(int num1, int num2) {
        return (num1 * num2) / GCD(num1, num2);
    }
    static int GCD(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        }

        return GCD(num2, num1 % num2);
    }
}
