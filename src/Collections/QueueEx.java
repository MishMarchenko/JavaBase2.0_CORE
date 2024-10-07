package Collections;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Deque<String> q1 = new LinkedList<>();
        q1.add("st1");
        q1.add("st2");
        q1.add("st3");
        System.out.println(q1.element());
        System.out.println(q1.remove());
        System.out.println(q1.element());
        Stack<String> q2 = new Stack<>();
        q2.add("st1");
        q2.add("st2");
        q2.add("st3");
        System.out.println(q2.pop());
        Set<Integer> set1 = new HashSet<>();

        set1.add(5);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(9);
        System.out.println(set1);

//        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "st1");
        map.put(4, "st2");
        map.put(3, "st3");
        map.put(4, "st4");
        map.put(2, "st5");

        for (Map.Entry<Integer, String> mapping : map.entrySet()){
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }
    }
}
