class Person {
    void speak(){
        System.out.println("Person speaks");
    } 
}

class Student extends Person {
    void study(){
        System.out.println("Student studies");
    }
}

class CollegeStudent extends Student {
    void giveExam(){
        System.out.println("College student gives exam");
    }
}

public class P17_MultilevelInheritence {
    public static void main(String[] args) {
        CollegeStudent std1 = new CollegeStudent();
        std1.speak();
        std1.study();
        std1.giveExam();
    }
}

