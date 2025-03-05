import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"John", "Dona", "Charlie", "Steve", "Elon"};
        
        System.out.print("Enter an index to access: ");
        // make sure you enter input bigger then the names array
        int index = sc.nextInt();
        // Uncomment to see the actual exception
        // generateException(names, index);

        handleException(names, index);
    }

    public static void generateException(String[] names, int index) {
        System.out.println("Accessing invalid index...");
        System.out.println("Name: " + names[index]); // This will throw ArrayIndexOutOfBoundsException
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Handling invalid index access...");
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: handled array out bound exception");
        }
    }
}
