interface SayMethod{
    default void say(){
        System.out.println("Hello, this is default method!");
    }

    void sayMore(String msg);
}

class DefaultTest implements SayMethod{
    @Override
    public void say(){
        System.out.println("Hello, this is method!");
    }

    public void sayMore(String msg){
        System.out.println("Message: "+ msg);
    }
}

public class P44_DefaultMethod {
    public static void main(String[] args) {
        DefaultTest test1 = new DefaultTest();
        test1.say();
        test1.sayMore("testing...");
    }
}