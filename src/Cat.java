import Exceptions.InvalidCatAgeException;
import Exceptions.InvalidCatNameException;

public class Cat {
    private String name;
    private int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age < 0){
            throw new InvalidCatAgeException("Cat's age must be 0 or more year");
        }
        this.age = age;
    }
    public void setName(String name){
        if (name.length() < 2){
            throw new InvalidCatNameException("Cat's name must be 2 or more symbols");
        }
        this.name = name;
    }
    public String toString(){
        return "Cat: name = " + name + ", age = " + age;
    }
}
