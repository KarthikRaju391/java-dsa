public class MinPositive {
    public static void main(String[] args) {
       int ans = findMinPositive(9);
        System.out.println(ans);
    }

    static int findMinPositive(int n) {
        int i = 0;
        while(i < 50) {
            int val = i * n;
            if(n == sumOfDigits(val) && val != n) {
               return val;
            } else {
                i++;
            }
        }
        return -1;
    }

    static int sumOfDigits(int a) {
        int sum = 0;
        while(a != 0) {
            int rem = a % 10;
            sum += rem;
            a /= 10;
        }
        return sum;
    }
}
