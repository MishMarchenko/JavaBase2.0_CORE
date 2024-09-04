package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        int [] array = new int[]{1, 2, 3, 4, 5};
//        array[5] = 6;

        List<Integer> list = new ArrayList<>(5);


//        list = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            list.add(i);
        }
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(2));
        list.set(2, 9);
        System.out.println(list);
        System.out.println(list.contains(2));
        for (int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list = new LinkedList<>(list);
        list.add(5);
        System.out.println(list);
    }
}
