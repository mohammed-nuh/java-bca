import java.io.FileReader;
import java.io.IOException;

class P24_CheckedExceptionTryCatch {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt"); // checked exception
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
