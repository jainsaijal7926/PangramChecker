import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");

        // Read the sentence input from the user
        String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        // Check if the sentence is a pangram
        boolean isPangram = isPangram(sentence);

        // Display the result
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        // Close the Scanner to release resources
        scanner.close();
    }

    // Function to check if a sentence is a pangram
    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        // Iterate through the characters in the sentence
        for (char c : sentence.toCharArray()) {
            // Check if the character is a lowercase letter (a to z)
            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }

        // Check if all lowercase letters (a to z) are present in the set
        return alphabetSet.size() == 26;
    }
}
