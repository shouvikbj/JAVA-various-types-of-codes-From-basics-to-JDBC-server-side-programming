public class threadTest4 implements Runnable{
    public void run(){
        for(int i=1; i<=20; i++){
            if(Thread.currentThread().getName().equals("t1")){
                if(i%2==0){
                    System.out.println("Thread - t1 : ");
                    System.out.println(i);
                }
                else{
                    continue;
                }
            }
            if(Thread.currentThread().getName().equals("t2")){
                if(i%2!=0){
                    System.out.println("Thread - t2 : ");
                    System.out.println(i);
                }
                else{
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        threadTest4 tt4 = new threadTest4();
        Thread t1 = new Thread(tt4);
        Thread t2 = new Thread(tt4);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}