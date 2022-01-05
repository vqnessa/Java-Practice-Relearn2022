import java.util.Scanner;

public class Main {
    // calculate fibonacchi sequence
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // print fibonacci sequence based off user input
    // time complexitiy O(2^n) -- try to find a different way (on hold)
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Fibonacchi Number: ");

        int n = userInput.nextInt();
        System.out.println("Your Fibonacchi Sequence Number: " + fib(n));
    }
}