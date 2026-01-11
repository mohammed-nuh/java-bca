class Animal {
    void eat(){
        System.out.println("Eating");
    } 
}

class Dog extends Animal {
    void bark(){
        System.out.println("Gog bhau bhau kar");
    } 
}

class Cat extends Animal {
    void meow(){
        System.out.println("Cutie meowing kar, bar bar");
    } 
}

public class P16_HeirarchicalInhreritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}

