public class P39_ValueOfMethod {
    public static void main(String[] args) {
        
        int a = 30;      
        String b = String.valueOf(a); 

        System.out.println(b + 10);

        float f = 10.22f;
        double d = 10.09;      
        String str1 = String.valueOf(f); 
        String str2 = String.valueOf(d); 
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 + str2);
    }
}
