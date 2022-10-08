package Capgemini;

public class ProdOfUniqFactors {
    public static void main(String[] args) {
        getFactors(64);
    }

    static void getFactors(int n) {
        int a = n, b = n, c;

        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                a = i;
                break;
            }
        }

        n = n / a;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                if(i != a) {
                    b = Math.min(b, i);
                }
                if((n/i) != i) {
                    if((n/i) != a) {
                        b = Math.min(b, n/i);
                    }
                }
            }
        }

        c = n / b;
        if(a != b && b != c && c != -1) {
            System.out.println(a + ", " + b + ", " + c);
        }
        else {
            System.out.println("Not possible");
        }
    }
}
