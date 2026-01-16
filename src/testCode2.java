class Student {
    void printMessage(){
        System.out.println("I am a student");
    }
}

class BcaStudent extends Student {
    @Override
    void printMessage(){
        System.out.println("I am a BCA student");
    }
}

public class testCode2 {
    public static void main(String[] args){
        Student std1 = new BcaStudent();
        std1.printMessage();
    }
}