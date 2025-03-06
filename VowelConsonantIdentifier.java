import java.util.Scanner;

public class VowelConsonantIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] classification = classifyCharacters(input);
        System.out.println("Character\tType\n");
        for (String[] row : classification) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
    //helper method to check if given char is vowel or consonant or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }
    // storing the result in 2D array for better and clear solution 
    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharacterType(str.charAt(i));
        }
        return result;
    }
}

// input string: My name is harman
// output expected
// Character       Type
// M               Consonant
// y               Consonant
//                 Not a Letter
// n               Consonant
// a               Vowel
// m               Consonant
// e               Vowel
//                 Not a Letter
// i               Vowel
// s               Consonant
//                 Not a Letter
// h               Consonant
// a               Vowel
// r               Consonant
// m               Consonant
// a               Vowel
// n               Consonant

