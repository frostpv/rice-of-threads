import thread.Counter;
import thread.MyRunnable;
import thread.MyThread;

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread myThread = new MyThread(counter);
        MyRunnable myRunnable = new MyRunnable(counter);
        myThread.start();
        new Thread(myRunnable).start();
    }
}
