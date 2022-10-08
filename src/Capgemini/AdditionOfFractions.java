package Capgemini;

public class AdditionOfFractions {
    public static void main(String[] args) {
       int num1 = 2;
       int den1 = 3;
       int num2 = 3;
       int den2 = 9;
       int finNum = 0;
       int finDen = 0;

       if(den1 == den2) {
          finNum = num1 + num2;
          finDen = den1;
       } else {
           finDen = lcm(den1, den2);
           finNum = num1 * (finDen/den1) + num2 * (finDen/den2);
           int i = 2;
           while(true) {
              if(finNum % i == 0 && finDen % i == 0) {
                 finNum = finNum / i;
                 finDen = finDen / i;
                 break;
              } else {
                  i++;
              }
           }
       }

        System.out.println(finNum + "/" + finDen);
    }

    static int lcm(int n1, int n2) {
        int max = Math.max(n1, n2);
        int lcm = 0;
        for(int i = max; i < n1 * n2; i++) {
            if(i % n1 == 0 && i % n2 == 0) {
               lcm = i;
               break;
            }
        }
        return lcm;
    }
}
