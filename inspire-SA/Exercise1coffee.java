import java.util.Scanner;
import java.util.*;
/* live demo during AI Tuesday
*   Boost developer productivity with GitHub Copilot
    Full video available on Youtube:
     https://www.youtube.com/watch?v=8e7pDoIZCOs&ab_channel=InspireSA
*/ 
//main program
public class Exercise1coffee {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two numbers
        System.out.print("Enter the number of cups of coffee you drink per day: ");
        // Read two numbers from the console
        int cups = input.nextInt();
        // Invoke the add method to add two numbers
        int caffeine = caffeine(cups);
        // Display the result
        System.out.println("The caffeine in your body is " + caffeine + " mg");

        // close input
        input.close();
    }
    
    public static int caffeine(int cups) {
        return cups * 100;
    }
}
