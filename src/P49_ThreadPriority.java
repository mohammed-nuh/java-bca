public class P49_ThreadPriority extends Thread {
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        // Thread.currentThread().setPriority(3);
        // System.out.println(Thread.currentThread().getPriority());
        P49_ThreadPriority t1 = new P49_ThreadPriority();
        t1.setPriority(6);
        System.out.println("Priority of current thread: " + t1.getPriority());
    }
}