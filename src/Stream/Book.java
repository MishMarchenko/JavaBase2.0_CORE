package Stream;

public class Book implements Comparable<Book> {
    private String name;
    private int update;
    private String author;
    public Book(String name, int update, String author){
        this.name = name;
        this.update = update;
        this.author = author;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getUpdate(){
        return update;
    }
    public String toString(){
        return "Book: Name - " + name + ", Date update - " + update + ", Author - " + author + ";";
    }

    @Override
    public int compareTo(Book o) {
        return update - o.getUpdate();
    }
}
