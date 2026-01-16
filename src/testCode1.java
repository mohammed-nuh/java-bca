class Student {
    void printMessage(){
        System.out.println("I am a student");
    }
}

class BcaStudent extends Student {
    void printCourseName(){
        System.out.println("BCA");
    }
}

public class testCode1 {
    public static void main(String[] args){
        BcaStudent std1 = new BcaStudent();
        std1.printMessage();
        std1.printCourseName();
    }
}