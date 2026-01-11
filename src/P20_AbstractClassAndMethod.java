abstract class Shape {
    abstract void draw();

    void info(){
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("Circle is being drawn");
    }
}

public class P20_AbstractClassAndMethod {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.info();
        c1.draw();
    }
}