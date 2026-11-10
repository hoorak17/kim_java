package access;

import java.util.Scanner;

public class CounterMain {
    static void main() {

        MaxCounter counter = new MaxCounter(3);
        for (int i = 0; i <4; i++) {
            counter.increment();
        }
        int count = counter.getCount();
        System.out.println("Count is " + count);
    }
}
