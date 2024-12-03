package sample_program;

public class reverse_a_string {
    public static void main(String[] args) {
        // Input string
        String input = "Hello, World!";

        // Call the reverse function
        String reversed = reverseString(input);

        // Output the result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        // Initialize an empty String for the reversed string
        String reversed = "";

        // Loop through the original string from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }

        return reversed;
    }
}
