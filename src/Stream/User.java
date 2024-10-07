package Stream;

public class User implements Comparable<User> {
    private String name;
    private String surname;
    private int age;
    private String mail;
    public User(String name, String surname, int age, String mail){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mail = mail;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getMail(){
        return mail;
    }
    public String toString(){
        return "User: Name = " + name + ", Surname = " + surname + ", Age = " + age + ", Mail = " + mail + ";";
    }
    public int compareTo(User o){
        return age - o.getAge();
    }
}
