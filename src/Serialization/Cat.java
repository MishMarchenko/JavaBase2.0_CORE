package Serialization;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private Integer age;
    transient private Integer weight;
    private static final long serialVersionUID = -11L;
    public Cat(String name, Integer age, Integer weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString(){
        return "Cat: name = " + name +
                "; age = " + age +
                "; weight = " + weight;
    }
}
