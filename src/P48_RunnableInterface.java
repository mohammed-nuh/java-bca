public class P48_RunnableInterface implements Runnable {
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        P48_RunnableInterface t1 = new P48_RunnableInterface();
        Thread th1 = new Thread(t1);
        th1.start();
    }
}