package Advance;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {

//        Account<Long, String> acc = new Account<>(566445645465464654L);
//        acc.fill(5465465465L);
//        Account<Integer, String> acc2 = new Account<>(3212);
//        acc2.fill(444);
        List<Number> array = new ArrayList<>();
        array.add(1.2);
        array.add(64);
        array.add(64868847684L);

        List<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(64);
        array2.add(648687684);

        getCollection(array);
        getCollection(array2);


    }
    public static void getCollection(List<? extends Number> array){
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
