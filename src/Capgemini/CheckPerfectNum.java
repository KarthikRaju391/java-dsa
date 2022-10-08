package Capgemini;

public class CheckPerfectNum {
    public static void main(String[] args) {
        System.out.println(check(496));
    }

    static void showPerfectNums(int n) {
        for(int i = 1; i <= n; i++) {
            if(check(i)) System.out.println(i);
        }
    }
    static boolean check(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
