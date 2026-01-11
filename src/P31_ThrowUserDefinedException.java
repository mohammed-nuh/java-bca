class UserDefinedException extends Exception {
    public UserDefinedException(String str){
        super(str);
    }
}

public class P31_ThrowUserDefinedException {
    public static void main(String[] args) {
        try {    
            throw new UserDefinedException("bewajah nahi milna tera mera");
        } catch (UserDefinedException e){
            System.out.println(e.getMessage());
        }
    }
}