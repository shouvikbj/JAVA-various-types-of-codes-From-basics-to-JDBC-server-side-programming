public class threadTest1 extends Thread{
    public void run(){
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        threadTest1 t1 = new threadTest1();
        threadTest1 t2 = new threadTest1();

        System.out.println("Name of t1 : "+t1.getName());
        System.out.println("Name of t2 : "+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Scooby");
        t2.setName("Shaggy");

        System.out.println("After changing Names : ");
        System.out.println("Name of t1 : "+t1.getName());
        System.out.println("Name of t2 : "+t2.getName());
    }
}