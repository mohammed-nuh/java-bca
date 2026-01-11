class DemoService {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside function...");
        throw new IllegalAccessException("Error");
    }
}

public class P29_ThrowsKeyword {
    public static void main(String[] args) {
        try {
            DemoService.fun(); // direct call
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
