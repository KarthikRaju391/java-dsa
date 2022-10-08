package Cognizant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CourseAvailability {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of courses: ");
        int courses = in.nextInt();
        if(courses < 1) {
            System.out.println("Invalid Range");
            return;
        }
        ArrayList<String> coursesArr = new ArrayList<>();

        System.out.printf("Enter the " + courses + " courses: ");
        for(int i = 0; i < courses; i++) {
            coursesArr.add(in.next());
        }

        System.out.println("Enter the course to be searched: ");
        String search = in.next();

        if(coursesArr.contains(search)) {
            System.out.println(search + " course is available!");
        } else {
            System.out.println(search + " course is unavailable...");
        }
    }
}
