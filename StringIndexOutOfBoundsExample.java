import java.util.Scanner;
public class StringIndexOutOfBoundsExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        // Uncomment to see the exception 
        // generateException(string);

        handleException(string);
    }
    public static void generateException(String str) {
        System.out.println("Accessing invalid index...");
        System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleException(String str) {
        try {
            System.out.println("Handling invalid index access...");
            System.out.println(str.charAt(str.length())); // Accessing beyond valid index
        } catch (StringIndexOutOfBoundsException) {
            System.out.println("Exception Handled: Invalid index access");
        }
    }
}
