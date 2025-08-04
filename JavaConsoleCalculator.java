package day1;

import java.util.Scanner;

public class JavaConsoleCalculator {  

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {  // Fixed spelling: substraction → subtraction
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;  // Or throw an exception if you want
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("\nChoose operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                flag = false;
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + division(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        
    }
}
