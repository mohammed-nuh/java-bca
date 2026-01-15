public class P47_ThreadClass extends Thread {
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        P47_ThreadClass t1 = new P47_ThreadClass();
        t1.start();
    }
}