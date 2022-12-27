/* Code Written by Artyom Pionov */

// Importing the Scanner Class
import java.util.Scanner;

public class Calculator {
    @SuppressWarnings({"ReassignedVariable", "EnhancedSwitchMigration"}) // For nice code look, just for me :)

    public static void calculator() {

        // Initialising the result variable for later use
        int result = 0;

        // Creating the scanner object
        Scanner userInput = new Scanner(System.in);

        //---The User Input---
        // Getting the first operand
        System.out.println("Input the first operand: ");
        int operand1 = userInput.nextInt();

        // Getting the second operand
        System.out.println("Input the second operand: ");
        int operand2 = userInput.nextInt();

        //---Choosing an operation---
        // Getting the operation symbol
        System.out.println("Input an operator: ");
        char operation = userInput.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Adding...");
                result = operand1 + operand2;
                break;
            case '-':
                System.out.println("Subtracting...");
                result = operand1 - operand2;
                break;
            case '*':
                System.out.println("Multiplying...");
                result = operand1 * operand2;
                break;
            case '/':
                System.out.println("Dividing...");
                result = operand1 / operand2;
                break;
        }

        // Output the result
        System.out.println("The Result: " + result);
    }

    // Running the code :)
    public static void main(String[] args) {
        calculator();
    }
}


