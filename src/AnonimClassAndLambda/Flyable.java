package AnonimClassAndLambda;

public interface Flyable {
    void fly();
//    void swim();
    default void eat(){
        System.out.println("I am eating now");
    }
}
