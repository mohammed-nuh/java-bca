class Student {
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }    

    void printDetails(){
        System.out.println("Age: "+this.age);
        System.out.println("Name: "+this.name);
    }
}

class CollegeStudent extends Student {
    String courseName;

    CollegeStudent(int age, String name, String courseName){
        super(age, name);
        this.courseName = courseName;
    }    

    void printDetails(){
        super.printDetails();
        System.out.println("Couse Name: "+  this.courseName);
    }
}

public class testCode6 {
    public static void main(String[] args){
        CollegeStudent cs1 = new CollegeStudent(19, "Nuh", "BCA");
        cs1.printDetails();
    }
}