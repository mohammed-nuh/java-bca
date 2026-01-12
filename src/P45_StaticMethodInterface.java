interface SayMethod{
    static void say(){
        System.out.println("Hello, this is static method!");
    }
}

public class P45_StaticMethodInterface {
    public static void main(String[] args) {
        SayMethod.say();
    }
}