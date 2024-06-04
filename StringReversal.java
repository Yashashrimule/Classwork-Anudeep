//WAP to Reverse a string with the help of loop.

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reversing the string
        String reversed = reverseString(input);
        
        // Displaying the reversed string
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
    
    public static String reverseString(String input) {
        // Creating an empty string to store the reversed string
        String reversed = "";
        
        // Iterating through the characters of the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            // Appending each character to the reversed string
            reversed += input.charAt(i);
        }
        
        // Returning the reversed string
        return reversed;
    }
}