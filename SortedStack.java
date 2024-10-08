import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class reads a list of integers from user input and stores them into a Stack.
 * First, we will store numbers into a linkedlist to sort before we put them into a stack.
 * The integers in the Stack are sorted from the smallest to the largest.
 * It uses Java Collections Framework for managing collections of integers.
 * 
 * @author Aaron Baidoo
 * @version 1.0.0
 * @since Week 5 of CSC6301
 * 
 */
public class SortedStack {
    /**
     * Main method that drives the execution of the program. 
     * This reads integer from the user inputs, stores them in a linkedList. 
     * sort them in ascending order, and then pushed them into a Stack in the sorted order. using the collection framework.
     * 
     * @param arges command line arguments (None)
     * 
     */

    public static void main(String[] args) {

        // Create a LinkedList to temporarily store input integers due to stack does not support sorting. 

        LinkedList<Integer> tempList = new LinkedList<>();

        // Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values, and Read user inputs until 'done' is entered
        System.out.println("Enter integers separated by spaces (type 'done' to finish):");

        // while loop will iterator through each next digit from the user input. if digit is next to another digit, add the integer to the LinkedList named number else exit the loop when 'done' is entered.
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                tempList.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;  // Exit the loop if 'done' is entered
            } else {
                System.out.println("Invalid input. Please enter only integers or 'done' to finish.");
            }
        }
        // Close the scanner to prevent resource leaks
        scanner.close();

        // using collection package to Sort the Temporary list of integers.
        Collections.sort(tempList);

        // Create a Stack to move the stored integers in the Temporary list to a Stack. 
        Stack<Integer> sortedStack = new Stack<>();

        // Push (add) all items from the sorted Temporary LinkedList into a Stack
        for (int num : tempList) {
            sortedStack.push(num);
        }

        // Print the output of the stack. 
        System.out.println("Sorted Stack (from first in, last out): " + sortedStack);
    }
}
//code reuse are used throughout this code. java collections framework LinkedList<integer> numbers = new Linkedlist<>() and collections.sort(numbers). I reused java.util.Stack; for method by Stack<Integer>sortedStack new Stack Also using Scanners to read the user inputs is a reuse code in the java packaging. reused Stack from java.util to create an empty stack to push LinkedList integer. 