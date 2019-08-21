import java.util.concurrent.CyclicBarrier;

public class threadTest5 implements Runnable{
    
    public static final CyclicBarrier gate = new CyclicBarrier(4);

    public void run(){
        try{
            gate.await();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+" is running..");
    }

    public static void main(String[] args) {

        threadTest5 tt5 = new threadTest5();
        Thread t1 = new Thread(tt5);
        Thread t2 = new Thread(tt5);
        Thread t3 = new Thread(tt5);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        try{
            gate.await();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("All Threads Started..");
    }
}