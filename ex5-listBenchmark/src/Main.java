//
//  Main.java
//  ex5-listBenchmark
//
//  Created by Fernando Pastor on 29/7/24
//

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();
        Duration arrayListDur = Duration.ZERO;
        Duration linkedListDur = Duration.ZERO;

        System.out.println("TEST 1. Add 100.000(double) random items always at position 0.");
        arrayListDur = arrayListDur.plus(listBenchmark(arrayList,1, "ArrayList"));
        linkedListDur = linkedListDur.plus(listBenchmark(linkedList,1, "LinkedList"));

        System.out.println("TEST 2. Delete the first 50.000 items (always delete the first one).");
        arrayListDur = arrayListDur.plus(listBenchmark(arrayList,2, "ArrayList"));
        linkedListDur = linkedListDur.plus(listBenchmark(linkedList,2, "LinkedList"));

        System.out.println("TEST 3. Add 50.000 random items in random positions.");
        arrayListDur = arrayListDur.plus(listBenchmark(arrayList,3, "ArrayList"));
        linkedListDur = linkedListDur.plus(listBenchmark(linkedList,3, "LinkedList"));

        System.out.println("TEST 4. Delete 50.000 items from random positions.");
        arrayListDur = arrayListDur.plus(listBenchmark(arrayList,4, "ArrayList"));
        linkedListDur = linkedListDur.plus(listBenchmark(linkedList,4, "LinkedList"));

        System.out.println("TEST 5. Delete items that are in even positions (divisible by 2) using an Iterator.");
        arrayListDur.plus(listBenchmark(arrayList,5, "ArrayList"));
        linkedListDur = linkedListDur.plus(listBenchmark(linkedList,5, "LinkedList"));

        System.out.println("TESTS DURACIÓN TOTAL:");
        System.out.printf("- ArrayList: %d ms.\n", arrayListDur.toMillis());
        System.out.printf("- LinkedList: %d ms.\n", linkedListDur.toMillis());
    }

    public static Duration listBenchmark(List<Double> list, int test, String label) {
        Random random = new Random();
        Instant start = Instant.now();
        switch(test) {
            case 1: test1(list, random);
                break;
            case 2: test2(list);
                break;
            case 3: test3(list, random);
                break;
            case 4: test4(list, random);
                break;
            case 5: test5(list);
                break;
        }
        Instant end = Instant.now();
        Duration dur = Duration.between(start, end);
        System.out.printf("- %s: %d ms.\n", label, dur.toMillis());
        return dur;
    }

    private static void test1(List<Double> list, Random random) {
        for (int i = 0; i < 100000; i++) {
            list.addFirst(random.nextDouble());
        }
    }

    private static void test2(List<Double> list) {
        for (int i = 0; i < 50000; i++) {
            list.removeFirst();
        }
    }

    private static void test3(List<Double> list, Random random) {
        for (int i = 0; i < 50000; i++) {
            int index = random.nextInt(0, list.size() - 1);
            list.add(index, random.nextDouble());
        }
    }

    private static void test4(List<Double> list, Random random) {
        for (int i = 0; i < 50000; i++) {
            int index = random.nextInt(0, list.size() - 1);
            list.remove(index);
        }
    }

    private static void test5(List<Double> list) {
        ListIterator<Double> listIterator = list.listIterator();
        if (listIterator.hasNext()) {
            do {
                Double element = listIterator.next();
                if (element % 2 == 0) {
                    listIterator.remove();
                }
            } while (listIterator.hasNext());
        }
    }

}
