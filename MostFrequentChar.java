import java.util.Scanner;
//defining the method to get the char with most frequency
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;

        char maxChar = ' ';
        int maxCount = 0;
        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Most Frequent Character: " + maxChar);
    }
}
