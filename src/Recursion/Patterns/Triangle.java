package Recursion.Patterns;

public class Triangle {
    public static void main(String[] args) {
        pattern(5, 0);
    }


    static void pattern(int row, int col) {
       if(row < 0) {
           return;
       }
       if(row < col) {
           System.out.print("* ");
           pattern(row, col+1);
       } else {
           System.out.println();
           pattern(row - 1, 0);
       }
    }
}
