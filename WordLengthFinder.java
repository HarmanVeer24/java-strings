import java.util.Scanner;

public class WordLengthFinder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Get words and their lengths
        String[] words = splitWords(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the result in a tabular format
        System.out.println("\nWord\t\tLength");
        for (String[] entry : wordsWithLengths) {
            System.out.println(entry[0] + "\t\t" + Integer.parseInt(entry[1]));
        }
    }

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        int spaceCount = 0;

        // Count the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordStart = 0, wordIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordIndex] = text.substring(wordStart);

        return words;
    }

    // Method to return a 2D String array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Store word
            wordLengths[i][1] = String.valueOf(findLength(words[i])); // Store length
        }

        return wordLengths;
    }
}

// input my name is harman
// output expected 
// Word            Length
// my              2
// name            4
// is              2
// harman          6

