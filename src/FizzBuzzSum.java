public class FizzBuzzSum {
    public static void main(String[] args) {
        int res = findMaxExp(7, 12);
        System.out.println(res);
    }

    static int countExp(int n) {
        int count = 0;
        while(n % 2 == 0 && n != 0) {
            count++;
            n = n / 2;
        }
        return count;
    }

    static int findMaxExp(int m , int n) {
        int max = 0;
        int num = 0;
        for(int i = m; i <= n; i++) {
            int curr = countExp(i);
            if(curr > max) {
                max = curr;
                num = i;
            }
        }
        return num;
    }

    static int findSum(int m, int n) {
        int sum = 0;
        for(int i = m; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
