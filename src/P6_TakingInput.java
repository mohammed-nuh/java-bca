import java.util.Scanner;

public class P6_TakingInput {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        String userName = scannerObject.nextLine();
        System.out.println("Username -> " + userName);
    }
}