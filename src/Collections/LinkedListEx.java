package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        System.out.println("Hello");
        List<String> st = new LinkedList<>();
        CustomLinkedList<Integer> array = new CustomLinkedList<>();
        array.add(9);
        array.add(5);
        array.add(32);
        array.add(96);
        array.add(956);
        array.add(196);
        System.out.println(array.getSize());
        System.out.println(array.get(0));
        System.out.println();
        array.delete(4);
        array.addFirst(98);
        array.addFirst(99);
        for (int i = 0; i < array.getSize(); i++){
            System.out.println(array.get(i));
        }
        System.out.println();
        System.out.println(array.getFirst());
        System.out.println(array.getLast());
//        List<Integer> linked = new LinkedList<>();
//        List<Integer> array = new ArrayList<>();
//
//        for (int i = 0; i < 1000; i++){
//            linked.add(i);
//            array.add(i);
//        }
//
//        long before = System.currentTimeMillis();
//        for (int i = 0; i < 1000; i++){
//            linked.get(i);
//        }
//        long after = System.currentTimeMillis();
//
//        System.out.println(after - before);
//        фронт 45мин(до перерыва)

    }
}
