import java.util.Scanner;

public class IllegalArgumentExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Uncomment to see the actual exception
        // generateException(str, start, end);

        handleException(str, start, end);
    }
    public static void generateException(String str, int start, int end) {
        System.out.println("Generating IllegalArgumentException...");
        System.out.println(str.substring(start, end)); // This will throw IllegalArgumentException if start > end
    }

    public static void handleException(String str, int start, int end) {
        try {
            System.out.println("Handling IllegalArgumentException...");
            System.out.println(str.substring(start, end));
        } catch (IllegalArgumentException) {
            System.out.println("Exception Handled: handled the argument exception");
        }
    }
}
