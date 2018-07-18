package Core;

public class MyRunnable implements Runnable {
    public void run() {
        try {

            int i = 0;
            while (true) {

                // sleep in 60 second
                Thread.sleep(10 * 1000);
                System.out.println("---------Starting check status of db----------" + (++i));

                // checkdb, if change oke return.
                if (i == 2) {

                    // end thread
                    break;
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.print("top 0' the stack");
    }
}