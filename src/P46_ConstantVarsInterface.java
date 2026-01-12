interface Vehicle {
    int SPEED_LIMIT = 80;
}

public class P46_ConstantVarsInterface {
    public static void main(String[] args) {
        System.out.println("SPEED_LIMIT: " + Vehicle.SPEED_LIMIT);
    }
}