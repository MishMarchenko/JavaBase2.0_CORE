package AnonimClassAndLambda;

import java.util.Scanner;

public class AnonimMain {

    static int a = 10;
    static int b = 20;
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.fly();

//        new Flyable(){
//            @Override
//            public void fly() {
//                System.out.println("I will fly");
//            }
//        }.fly();
//        Flyable fly = new Flyable(){
//            @Override
//            public void fly() {
//                System.out.println("I will fly");
//            }
//
////            @Override
////            public void swim() {
////                System.out.println("I can swim");
////            }
//        };
        Flyable fly = () -> System.out.println("I can fly");

        fly.fly();
//        fly.swim();
        fly.eat();

        Printable prin = System.out::println;
        prin.print("Hello world!");


//        Operation operation = () -> {
//            a = 30;
//            return a * b;
//        };
//        System.out.println(operation.calculate());

//        Operation operation = () -> a + b;
//        System.out.println(operation.calculate());
        Scanner scanner = new Scanner(System.in);

//        Operation operation = (a, b) -> {
//            if (a > 10){
//                return a * b;
//            } else {
//                return a + b;
//            }
//        };
//        System.out.println(operation.calculate(scanner.nextInt(), scanner.nextInt()));

//        Operationable<Integer> operation1 = (a, b) -> a + b;
//        Operationable<Integer> operation1 = Integer::sum;
//        Operationable<Integer> operation2 = (a, b) -> a - b;
//        Operationable<Integer> operation3 = (a, b) -> a * b;
//
//        System.out.println(operation1.calculate(scanner.nextInt(), scanner.nextInt()));

        Expression op = n -> n%2 == 0;
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(odd(array, op));

    }
    static int odd(int [] array, Expression op){
        int result = 0;
        for(int i : array){
            if(op.isEqual(i)){
                result += 1;
            }
        }
        return result;
    }
}
