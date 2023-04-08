import java.util.*;
/* live demo during AI Tuesday
*   Boost developer productivity with GitHub Copilot
    Full video available on Youtube:
     https://www.youtube.com/watch?v=8e7pDoIZCOs&ab_channel=InspireSA
*/ 

// Class: Execise0 which is the main class that has a method for adding two numbers a and b
public class Execise0 {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two numbers
        System.out.print("Enter two numbers: ");
        // Read two numbers from the console
        int a = input.nextInt();
        int b = input.nextInt();
        // Invoke the add method to add two numbers
        int sum = add(a, b);
        // Display the result
        System.out.println("The sum is " + sum);
    }

    // Method: add which adds two numbers a and b
    public static int add(int a, int b) {
        return a + b;
    }
}