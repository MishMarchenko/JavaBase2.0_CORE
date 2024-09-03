import Exceptions.InvalidCatAgeException;
import Exceptions.InvalidCatNameException;
import Exceptions.InvalidComputerScreenException;
import Exceptions.InvalidComputerSsdException;


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

        Computers computer1 = new Computers("HP", 256, 17.3);
        Computers computer2 = new Computers("Apple", 512, 15.7);
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        try {
            computer2.setSsd(25);
        } catch (InvalidComputerSsdException e){
            System.out.println(e.getMessage());
        }
        try {
            computer1.setScreen(15.77);
        } catch (InvalidComputerScreenException ignored){
        } finally {
            System.out.println("Found some exception");
        }
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}