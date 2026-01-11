class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    void printDetails() {
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    String name;

    Manager(int id, String name) {
        super(id);
        this.name = name;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Manager Name: " + this.name);
    }
}

public class P35_SuperKeyword {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Nuh");
        m.printDetails();
    }
}