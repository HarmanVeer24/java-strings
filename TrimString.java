import java.util.Scanner;
import java.lang.StringBuilder;

public class TrimString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        int[] indices = findTrimIndices(input);
        String manuallyTrimmed = createSubstring(input, indices[0], indices[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Manually Trimmed String: \"" + manuallyTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both trims equal? " + compareStrings(manuallyTrimmed, builtInTrimmed));
    }
    //defining the trim method
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    //stringbuilder method to create the updated string
    public static String createSubstring(String str, int start, int end) {
        StringBuilder trimmedStr = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedStr.append(str.charAt(i));
        }
        return trimmedStr.toString();
    }
    //helper boolean function to help cross check the result produced 
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
// input string "   My name is harman    "
//output expected
// Manually Trimmed String: "My name is Harman"
// Built-in Trimmed String: "My name is Harman"
// Are both trims equal? true
