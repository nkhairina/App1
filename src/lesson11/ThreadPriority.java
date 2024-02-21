package lesson11;

public class ThreadPriority {

    public static void main(String[] args) {
        // Creating three threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");

        // Setting thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Set Thread 1 to minimum priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Set Thread 2 to normal priority
        thread3.setPriority(Thread.MAX_PRIORITY); // Set Thread 3 to maximum priority

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " executing...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// Threads with higher priorities (such as thread3) are likely to be scheduled
// more frequently
// than threads with lower priorities (such as thread1).
// thread3 has the highest priority and may get more CPU time
// compared to thread1 and thread2.