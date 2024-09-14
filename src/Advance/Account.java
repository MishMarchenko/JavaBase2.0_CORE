package Advance;

public class Account<T extends Number, D> {
    T name;
    public Account(T name){
        this.name = name;
    }

    public void fill (T number){
        System.out.println(number);
    }
}
