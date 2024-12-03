package sample_program;

public class ReverseString {
    public static void main(String[] args) {
        // Input string
        String input = "Hello, World!";

        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Add characters in reverse order
        }

        // Output the result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
