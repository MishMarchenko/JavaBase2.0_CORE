import Exceptions.InvalidCatAgeException;
import Exceptions.InvalidCatNameException;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
//        try {
//            URL url = new URL("google.com");
//        } catch (MalformedURLException ignored){
//
//        }
//        try {
//            URL url = new URL("google.com");
//        } catch (MalformedURLException ex){
//            ex.printStackTrace();
//        }
//        try {
//            int i = 10 / 0;
//        } catch (ArithmeticException ex) {
//            ex.printStackTrace();
//        }
        Cat cat = new Cat("Aki", 5);
        cat.setAge(2);
        cat.setName("Bus Light-Year");
        try {
            cat.setName("O");
        } catch (InvalidCatNameException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            cat.setAge(-5);
        } catch (InvalidCatAgeException ignored){
        }
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.toString());
    }
}