package Cognizant;

import java.util.Scanner;

public class EmpSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        float appraisal = in.nextFloat();

        if(appraisal >= 1 && appraisal <= 3) {
            salary += 0.1 * salary;
        } else if(appraisal > 3 && appraisal <= 4) {
            salary += 0.25 * salary;
        } else if(appraisal > 4 && appraisal <= 5) {
            salary += 0.30 * salary;
        }

        System.out.println(salary);
    }
}
