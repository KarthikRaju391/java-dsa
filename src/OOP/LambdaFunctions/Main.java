package OOP.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
//        Consumer<Integer> update = (item -> System.out.println(item * 2));
//        list.forEach(update);

        Operations sum = Integer::sum;
        Operations prod = (a, b) -> a * b;
        Operations sub = ((a, b) -> a - b);

        Main myCalc = new Main();

        System.out.println(myCalc.operate(10, 3, prod));
    }

    private int operate(int a, int b, Operations op) {
        return op.operation(a, b);
    }

}

interface Operations {
    int operation(int a, int b);
}
