class RunnableThreadDemo implements Runnable {
    public void run() {
        System.out.println("Thread created by implementing Runnable interface is running.");
    }

    public static void main(String[] args) {
        RunnableThreadDemo myRunnable = new RunnableThreadDemo();
        Thread thread = new Thread(myRunnable); // Create a Thread object with the Runnable instance
        thread.start(); // Starts the thread
    }
}

/*
A class RunnableThreadDemo implements the Runnable interface.
The run() method is implemented to define the thread's task.
In main(), an instance of RunnableThreadDemo is created.
A Thread object is then created, passing the RunnableThreadDemo instance to its constructor.
thread.start() is called to initiate the thread's execution.
 */