import java.util.Scanner;

class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = sc.next();
        System.out.println("Length of the string is: " + StringLengthFinder(string));
    }

    // Helper function to calculate the length of a string
    public static int StringLengthFinder(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length); // Try accessing each character
                length++;
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Reached the end of the string."); // Print the message directly
        }
        return length;
    }
}
