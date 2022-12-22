package Practice;

import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {4, 5, 8, 9};
        int[] c = {7, 9, 10, 11};

        HashSet<Integer> set_a = new HashSet<>();
        HashSet<Integer> set_b = new HashSet<>();
        HashSet<Integer> set_c = new HashSet<>();
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length && k < c.length) {
            set_a.add(a[i++]);
            set_b.add(b[j++]);
            set_c.add(c[k++]);
        }
        while(i < a.length) {
            set_a.add(a[i++]);
        }
        while(j < b.length) {
            set_b.add(b[j++]);
        }
        while(k < c.length) {
            set_b.add(c[k++]);
        }

        System.out.println(set_a);
        System.out.println(set_b);
        System.out.println(set_c);

        set_a.retainAll(set_b);
        set_a.retainAll(set_c);

        if(set_a.size() > 0) {
            for(Integer elem: set_a) {
                System.out.println(elem);
            }
        } else {
            System.out.println("No Common Element Found");
        }

    }
}
