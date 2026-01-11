class P14_Methods {
    static void greet() {
        System.out.println("Hello!");
    }

    static void sumNos(int x, int y) {
        int sum = x + y;
        System.out.println("Sum of Nos: " + sum);
    }

    public static void main(String[] args) {
        greet();

        int num1 = 5;
        int num2 = 8;

        sumNos(num1, num2);
    }
}
