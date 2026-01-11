interface Fly {
    void fly();
}

interface Swim {
    void swim();
}

class Duck implements Fly, Swim {
    public void fly() {
        System.out.println("Duck can fly");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }
}

public class P18_MultipleInheritence {
    public static void main(String[] args){
        Duck duck1 = new Duck();
        duck1.fly();
        duck1.swim();
    }
}
