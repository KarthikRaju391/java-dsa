package Capgemini;

public class ReplaceAllZeros {
    public static void main(String[] args) {
        System.out.println(replaceZerosInt(120053));
    }

    static String replaceZeros(int n) {
        String num = n+"";

        return num.replaceAll("0", "1");
    }

    static int replaceZerosInt(int n) {
        int res = 0;
        int temp = 1;
        while(n != 0) {
            int rem = n % 10;
            if(rem == 0) {
                rem = 1;
            }
            res += temp * rem;
            temp *= 10;
            n /= 10;
        }

        return res;
    }
}
