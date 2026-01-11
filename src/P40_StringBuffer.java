public class P40_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}