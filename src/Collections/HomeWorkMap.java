package Collections;

import java.util.*;

public class HomeWorkMap {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Java");
        str.add("Python");
        str.add("Perl");
        str.add("C++");
        str.add("Java");
        str.add("C++");
        str.add("C#");
        System.out.println(str);
        Set<String> set = new HashSet<>(str);
        System.out.println(set);
        System.out.println();

        Map<String, Integer> contacts = new HashMap<>();
        contacts.put("Bob", 1);
        contacts.put("Bill", 2);
        contacts.put("Mikho", 3);
        contacts.put("Kimber", 4);
        contacts.put("Rachel", 5);
        contacts.put("Lea", 6);
        contacts.put("Abella", 7);
        contacts.put("Lena", 8);
        contacts.put("Rae", 9);
        contacts.put("Scarlet", 10);
        for (Map.Entry<String, Integer> mapping : contacts.entrySet()){
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }
        System.out.println();

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 5 ,8, 5, 2, 3, 3, 5, 4, 7, 6, 8, 1));
        System.out.println(counterCatch(array, 3));

    }
    public static int counterCatch(ArrayList<Integer> arrayList, int value){
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) == value){
                count ++;
            }
        }
        return count;
    }
}
