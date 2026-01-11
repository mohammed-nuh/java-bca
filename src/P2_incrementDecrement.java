public class incrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial value of a: " + a);

        // Post-increment
        System.out.println("Post-increment a++: " + (a++));
        System.out.println("Value of a after post-increment: " + a);

        // Pre-increment
        System.out.println("Pre-increment ++a: " + (++a));
        System.out.println("Value of a after pre-increment: " + a);

        // Post-decrement
        System.out.println("Post-decrement a--: " + (a--));
        System.out.println("Value of a after post-decrement: " + a);

        // Pre-decrement
        System.out.println("Pre-decrement --a: " + (--a));
        System.out.println("Value of a after pre-decrement: " + a);
    }
}
