class MyThread implements Runnable {
    void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }
}

public class testCode4 {
    public static void main(String[] args){
        MyThread r1 = new Mythread();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}