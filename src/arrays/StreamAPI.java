package arrays;

import java.util.ArrayList;

public class StreamAPI {
    public static void main(String[] args) {
        fun();
    }

    static void fun() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1452");
        list.add("324");
        list.add("2341");
        list.add("013");
        list.add("45");
        list.add("123");

        Integer sum = list.stream()
                .map(x -> Integer.parseInt(x))
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
