package Serialization;

import java.io.*;

public class SerialMain {
    public static void main(String[] args) {

//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))){
//            Person person = new Person("Nick", 25);
//            oos.writeObject(person);
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))){
//
//            Person p = (Person) ois.readObject();
//            System.out.println(p);
//        } catch (IOException | ClassNotFoundException e){
//            throw new RuntimeException(e);
//        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat.dat"))){
            Cat cat = new Cat("Bob", 2, 3);
            oos.writeObject(cat);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cat.dat"))){
            Cat newCat = (Cat) ois.readObject();
            System.out.println(newCat);
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
