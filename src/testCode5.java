import java.util.Scanner;

public class testCode5 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = scanner1.nextLine();
        System.out.println("Hash code: "+ str.hashCode());
        str = str + " Abuhuseina";
        System.out.println("Hash code: "+ str.hashCode());

        StringBuffer sb = new StringBuffer("Nuh");
        System.out.println("Hash code: "+ sb.hashCode());
        sb.append(" Abuhuseina");
        System.out.println("Hash code: "+ sb.hashCode());
    }
}