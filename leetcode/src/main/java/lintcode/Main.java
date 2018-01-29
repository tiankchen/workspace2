package lintcode;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private int i = 0;

    public Main(int i) {
        this.i = i;
    }

    public static Main valueOf(int i) {
        Main m = new Main(2);
        return m;
    }

    public static void main(String args[]) {

        String str = "hello";
        str.hashCode();

        Map<String, Integer> dict = new HashMap<>(20);
        dict.put("nihao", 2);
        dict.put("aaa", 3);

        Collection<Integer> ret = dict.values();

        int LOOP = 10;
        for (int i = 0; i < LOOP; ++i)
            System.out.println(ThreadLocalRandom.current().nextInt());


        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("before" + Thread.currentThread().isInterrupted());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().isInterrupted());
                    System.out.println(new Date());
                }
            }
        };
        t.interrupt();
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.hashCode();

        System.out.println("sss" + t.isInterrupted());
    }


}

interface Hello<E> {
    void Print();
}
