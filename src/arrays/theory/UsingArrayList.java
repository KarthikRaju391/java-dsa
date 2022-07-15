package arrays.theory;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
    }
}
