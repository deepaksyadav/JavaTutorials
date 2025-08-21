class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class is running.");
    }

    public static void main(String[] args) {
       ThreadDemo thread = new ThreadDemo();
        thread.start(); // Starts the thread, which calls the run() method
    }
}
/*
A new class ThreadDemo extends Thread.
The run() method is overridden to define the code that the thread will execute.
In main(), an instance of ThreadDemo is created.
thread.start() is called to begin the execution of the new thread.
This method internally calls the run() method.
 */