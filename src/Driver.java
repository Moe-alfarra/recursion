import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter an int number: ");
//        int num = keyboard.nextInt();
//        System.out.println("Factorial of " + num + " is: " + factorial(num));

        for (int i = 1; i < 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
    public static long factorial(int num) {
        if (num == 1) {
            return 1;
        }
        else {
            return num * factorial(num-1);
        }
    }

    public static long recursive(int num) {
        if (num == 0) {
            return 5;
        }
        else {
            return 2 * recursive(num-1) +3;
        }
    }

    public static long fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        else {
            return fibonacci(num - 1 ) + fibonacci(num - 2);
        }
    }

}
