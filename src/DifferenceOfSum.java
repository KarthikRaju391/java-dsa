import java.util.Scanner;

public class DifferenceOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = diff(n, m);
        System.out.println(res);
    }

    static int diff(int n, int m) {
        int[] arr = new int[m];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int fSum = 0;
        int nSum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % n == 0) {
               fSum += arr[i];
            } else {
                nSum += arr[i];
            }
        }
        return Math.abs(nSum - fSum);
    }
}
