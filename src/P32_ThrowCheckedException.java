import java.io.*;

class P32_ThrowCheckedException {
    public static void method() throws FileNotFoundException{
        FileReader fr = new FileReader("data.txt"); // checked exception
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            method();// checked exception
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error catched");
        }
    }
}
