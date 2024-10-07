package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExMain {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(6);
//        list.add(45);
//        list.add(34);
//        list.add(777);
//        list.add(2);
//        list.add(4535);
//        list.add(3);
//        list.add(87);
//        list.add(9);
//
//        Integer a = list.stream()
//                .max(Comparator.comparingInt(v -> v))
//                .get();
//        System.out.println(a);
        List<String> animals = List.of("Cat", "Dog", "Bird");
        animals.forEach(s -> System.out.println(s));
        animals.stream().filter(t -> t.length() > 3).forEach(System.out::println);

//        for (int i = 0; i < animals.size(); i++){
//            System.out.println(animals.get(i));
//        }
//        for (int i = 0; i < animals.size(); i++) {
//            if (animals.get(i).length() > 3) {
//                System.out.println(animals.get(i));
//            }
//        }

        List<Book> books = List.of(new Book("Java", 2015, "NoName"),
                new Book("Python", 2008, "PythonA"),
                new Book("Python", 2006, "PythonA"),
                new Book("Python", 2004, "PythonA"),
                new Book("Python", 2001, "PythonA"),
                new Book("C++", 2000, "CAuthor"));



//        books.stream()
//                .filter(year -> year.getUpdate() > 2005)
//                .filter(name -> name.getName().equals("Python"))
//                .map(Book::getAuthor)
//                .forEach(System.out::println);
        books.stream()
                .filter(author -> author.getAuthor().length() > 6)
                .sorted()
                .map(Book::getName)
                .skip(1)
                .limit(1)
                .distinct()
                .forEach(System.out::println);

//        List<String> nameOfBook = books.stream()
//                .filter(author -> author.getAuthor().length() > 6)
//                .sorted()
//                .map(Book::getName)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(nameOfBook);

//        long l = books.stream()
//                .filter(author -> author.getAuthor().length() > 6)
//                .sorted()
//                .map(Book::getName)
//                .distinct()
//                .count();
//
//        System.out.println(l);


        List<Integer> num = List.of(1, 2, 3, 4, 4, 4, 5, 6, 6, 9 ,8);
        num.stream()
                .filter(t -> t > 3)
                .sorted()
                .distinct()
                .forEach(System.out::println);

        Optional<Integer> op = num.stream()
                .filter(t -> t > 3)
                .sorted()
                .findFirst();
        try {
            System.out.println(op.orElseThrow(() -> new NotFoundNumberException("Number not found")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
