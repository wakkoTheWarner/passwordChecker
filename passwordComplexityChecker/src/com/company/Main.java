package com.company;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
	    String repeat = "yes";

	    // code
        while (repeat.equalsIgnoreCase("yes")) {
            System.out.println("Enter a password: ");
            String userInput = scanner.next();
            System.out.println("Is the password complex? " + isPasswordComplex(userInput));

            System.out.print("\nWould you like to repeat? ");
            repeat = scanner.next();
        }
        sayingGoodbye();
    }

    public static boolean isPasswordComplex(String password) {
        // variables
        boolean result;

        // code
        passwordChecker checkerA = new passwordChecker(password);
        result = checkerA.findComplexity();
        return result;
    }

    public static void sayingGoodbye() {
        System.out.println("Goodbye! :)");
    }
}
