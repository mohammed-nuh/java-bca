public class relationalAndLogicalOperators {
    public static void main(String[] args) {
        int a = 7, b = 11;
        System.out.println("a is " + a + " b is " + b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a != b);
        
        System.out.println((5 > 3) && (8 > 5)); 
        System.out.println((5 < 3) || (8> 5)); 
        System.out.println(!(5> 3));
    } 
}
