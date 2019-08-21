public class threadTest3 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            try{
                if(i==6){
                    Thread.sleep(5000);
                }
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        threadTest3 tt3 = new threadTest3();
        Thread t1 = new Thread(tt3);
        t1.start();
    }
}