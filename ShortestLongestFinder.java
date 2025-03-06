import java.util.Scanner;

public class ShortestLongestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text from the user
        System.out.println("Enter a sentence or paragraph:");
        String text = sc.nextLine();

        // Call the method to analyze text
        analyzeText(text);
    }

    // Method to analyze text and find shortest and longest words
    public static void analyzeText(String text) {
        // Split text into words
        String[] words = text.split("\\s+");

        // Initialize variables for the shortest and longest words
        String shortest = words[0];
        String longest = words[0];

        // Find shortest and longest words
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Display results
        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
