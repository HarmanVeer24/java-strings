import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        boolean iterative = isPalindromeIterative(text);
        System.out.println("Palindrome (Iterative): " + iterative);
    }
    //helper funtion to check if string is palindrome
    static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
}
//input 
// racecar
//output 
//true

