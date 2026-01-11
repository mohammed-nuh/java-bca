import java.io.*;

class P23_CheckedException {
    public static void main(String args[]) throws IOException{
    
        FileReader file = new FileReader("C:\\Nuh\\Code\\JavaPractice\\text\\para.txt");
        BufferedReader br = new BufferedReader(file);
        for (int counter = 0; counter < 3; counter ++) {
                System.out.println(br.readLine());
        }
        // String line;
        // while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        // }
        br.close();
    }
}