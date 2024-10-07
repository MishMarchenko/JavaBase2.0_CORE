package AnonimClassAndLambda;

import java.util.Scanner;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> pr = n -> n%2 == 0;
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(odd(array, pr));

        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(4));

        BinaryOperator<Integer> bo = (x, y) -> x * y;
        System.out.println(bo.apply(4, 4));

        UnaryOperator<Integer> uo = x -> x * x;
        System.out.println(uo.apply(5));

        Function<Integer, String> fun = x -> x + " $";
        Consumer<Integer> con = x -> System.out.println(x + " $");

        System.out.println(fun.apply(20));
        con.accept(20);

        Supplier<User> userCreator = () -> {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            return new User(name);
        };

        User user1 = userCreator.get();
        User user2 = userCreator.get();
        System.out.println(user1);
        System.out.println(user2);

        // лекция 1:36
    }
    static int odd(int[] array, Predicate<Integer> pr){
        int result = 0;
        for(int i : array){
            if(pr.test(i)){
                result += i;
            }
        }return result;
    }
}
