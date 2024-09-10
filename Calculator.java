import java.util.Scanner; // Import the Scanner class

// Creation of the Java calculater (Draft Branch)

/*/ 
- Addition
- Subtraction
- Multiplication
- Divison
/*/ 

class Calculator {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);   // Create a Scanner Object

        try {
            System.out.println("Enter your first number: ");
            double num1 = Double.parseDouble(myInput.nextLine()); // Convert input to double to handle decimal numbers

            System.out.println("Enter your second number: ");
            double num2 = Double.parseDouble(myInput.nextLine()); // Convert input to double to handle decimal numbers

            System.out.println("Choose your operation (+, -, *, /): ");
            String operation = myInput.nextLine();  // Read user input for operation.

            double result; // the total result in double
            
            switch (operation) {
                case "+":   // Addition
                result = num1 + num2;
                break;

                case "-":   // Subtraction
                result = num1 - num2;
                break;

                case "*":   // Multiplication
                result = num1 * num2;
                break;

                case "/":   // Division
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by Zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                return;
        }

        System.out.printf("Result: %.2f\n", result);   // Display result

    } catch (NumberFormatException e) {
        System.out.println("Error: Invalid number format");
    } finally {
        myInput.close();    // close the scanner
    }

    } // Main method
} // Calculator