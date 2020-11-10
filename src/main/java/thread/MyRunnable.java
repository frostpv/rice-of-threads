package thread;

import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyRunnable.class);
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isNotEnd()) {
            counter.plusOne();
            logger.info(Thread.currentThread().getName() + " vallue is: " + counter.getValue());
        }
    }
}
