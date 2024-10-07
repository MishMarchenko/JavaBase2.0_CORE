package AnonimClassAndLambda;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(4));

    }
    static int factorial(int a){
        if(a == 1){
            return 1;
        }
        return a * factorial(a - 1);
    }
    static int fibonacci(int b){
        if(b == 0){
            return 0;
        }
        if(b == 1){
            return 1;
        } else {
            return fibonacci(b - 1) + fibonacci(b - 2);
        }
    }
}
