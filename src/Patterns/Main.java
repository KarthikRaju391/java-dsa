package Patterns;

public class Main {
    public static void main(String[] args) {
        pattern33(5);
    }


    static void pattern33(int n) {
        for(int i = 0; i < n; i++){
            int spaces = n - i - 1;
            int c = n + i;
            int b = 0;
            StringBuilder sb = new StringBuilder();
            char ch = 'A';
            for(int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }
            for(int j = c; j >= n; j--) {
                ch = (char)(ch + b);
                b = 1;
                sb.append(ch).append(" ");
            }

            for(int j = n-1; j > spaces; j--) {
                ch = (char)(ch - b);
                sb.append(ch).append(" ");
            }
            System.out.print(sb);
            System.out.println();
        }
    }

    // PRINTS
    // A
    // BB
    // CCC
    // DDDD
    // EEEEE
    static void patternAA(int n) {
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
           for(int j = 0; j <= i; j++) {
              char ch = (char)('A' + i);
              sb.append(ch);
           }
            System.out.println(sb);
        }
    }

    // PRINTS
    // A
    // AB
    // ABC
    static void patternABC(int n) {
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j <= i; j++) {
                char ch = (char)('A' + j);
                sb.append(ch);
            }
            System.out.println(sb);
        }
    }
    static void pattern17(int n) {
        for(int row = 0; row <= 2*n - 1; row++) {

            int c = row > n ? 2*n - row : row;

            for(int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for(int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n) {
        for(int row = 0; row <= n; row++) {

            for(int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for(int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n) {
        // Number of lines == number of rows == outer for loop
        for(int i = 0; i < n; i++) {
            // For every row, check how many columns are there
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // Number of times outer loop runs
        for(int i = 0; i < n; i++) {
            // For every row, check how many columns are there
            for(int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for(int i = 1; i <= n; i++) {
           for(int j = 1; j <= i; j++) {
               System.out.printf("%d ", j);
           }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for(int i = 0; i < 2*n; i++) {
            int c;
            if(i > n) {
                c = 2*n - i;
            } else {
                c = i;
            }
            for(int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for(int i = 0; i < 2*n; i++) {
            int c = i > n ? 2*n - i : i;
            int spaces = n - c;
            for(int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
