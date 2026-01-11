interface Vehicle {
    int SPEED_LIMIT = 80;

    void run();
}

class Bike implements Vehicle {
    public void run(){
        System.out.println("Bike is running");
    }
}

public class P42_Interface {
    public static void main(String[] args) {
        Vehicle bike1 = new Bike();
        // Bike bike1 = new Bike();
        System.out.println(bike1.SPEED_LIMIT);
        bike1.run();
    }
}