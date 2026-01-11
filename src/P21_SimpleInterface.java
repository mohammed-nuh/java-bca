interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start(){
        System.out.println("Start the engine");
    }
}

public class P21_SimpleInterface {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
    }
}