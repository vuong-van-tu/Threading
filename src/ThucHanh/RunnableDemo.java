package ThucHanh;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);
        try{
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: "+threadName+", "+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+threadName+ " interrupted.");
        }
        System.out.println("Theard: "+threadName+" exiting");
    }
    public void start() {
        System.out.println("Start : "+threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
//class Main {
//
//    public static void main(String args[]) {
//        System.out.println("Main thread running... ");
//
//        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
//        runnableDemo1.start();
//
//        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
//        runnableDemo2.start();
//
//        System.out.println("Main thread stopped!!! ");
//    }
//}
