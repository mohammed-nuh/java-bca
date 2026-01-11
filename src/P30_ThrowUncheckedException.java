public class P30_ThrowUncheckedException {
    public static void validate(int age) throws IllegalAccessException{
        if(age > 18){
            System.out.println("Eligible");
        } else {
            throw new IllegalAccessException("Value not allowed");
        }
    }

    public static void main(String[] args) {
        try {    
            validate(13);
        } catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
}