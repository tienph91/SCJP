package main.java.Core;

class ThreadTestDrive {
    public static void main(String[] args) {

        boolean chk = true;

        // neu: lock successfully
        if (chk) {
            Runnable threadJob = new MyRunnable();
            Thread myThread = new Thread(threadJob);
            myThread.start();
        }

        System.out.println("Back in main");
    }
}