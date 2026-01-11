class Person {
    int age;
    String name;

    Person(int passedAge, String passedName){
        this.age = passedAge;
        this.name = passedName;
    }
    void printDetails(){
        System.out.println("Age => "+ this.age);
        System.out.println("name => "+ this.name);
    }
}

public class P33_Constructor {
    public static void main(String[] args) {
        Person p = new Person(19, "Nuh");
        p.printDetails();
    }
}