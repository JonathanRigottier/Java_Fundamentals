package threads.secondexample;

public class Main {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        MyThread thread = new MyThread();

        //Creating Thread objects
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        try{

            t1.join();
            t2.join();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("All done!");


    }
}
