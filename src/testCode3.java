public class testCode3 {
    public static void main(String[] args){
        try{
            int num = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("No matter what, I am gonna print");
        }
    }
}