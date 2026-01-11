class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void eat(){
        System.out.println("Dog eats");
    }

    void barks(){
        System.out.println("Dog barks");
    }
}

public class P19_OverrideMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.barks();
    }
}