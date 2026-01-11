class Person {
    int age;
    String name;

    void printDetails(){
        System.out.println("Age => "+ this.age);
        System.out.println("name => "+ this.name);
    }
}

public class P34_DefaultConstructor {
    public static void main(String[] args) {
        Person p = new Person();
        p.printDetails();
    }
}