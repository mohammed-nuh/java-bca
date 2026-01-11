public class P36_WrapperClass {
    public static void main(String[] args) {
        
        int a = 10;              // primitive type
        Integer b = Integer.valueOf(a); // wrapper class object

        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + b);

        // Auto-boxing
        Integer c = a;
        System.out.println("Auto-boxed Integer: " + c);

        // Unboxing
        int d = b;
        System.out.println("Unboxed int: " + d);
    }
}
