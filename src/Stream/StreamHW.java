package Stream;

import java.util.List;
import java.util.Optional;

public class StreamHW {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Mikho", "MikhoCo", 35, "blabla@gmail.net"),
                                   new User("Kate", "KateCo", 33, "kate@gmail.com"),
                                   new User("Mark", "MarkCo", 5, "markco@gmail.com"),
                                   new User("Vicky", "MarkCo", 35, "markco@gmail.com"));

        users.stream()
                .sorted()
                .map(User::getSurname)
                .distinct()
                .forEach(System.out::println);

        Optional<String> op = users.stream()
                .filter(surname -> surname.getSurname().length() <= 6)
                .map(User::getName)
                .findAny();
        try{
            System.out.println(op.orElseThrow(() -> new UsersNotFoundException("Wasn't found any user")));
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        users.stream()
                .filter(mail -> mail.getMail().length() < 20)
                .map(User::getAge)
                .skip(3)
                .forEach(System.out::println);
    }
}
