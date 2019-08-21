import java.util.Random;

public class threadTest2 implements Runnable{
    public void run(){
        Random random = new Random();
        String colors[] = {"white","blue","black","green","red","yellow"};
        int index;
        while((index = random.nextInt(6)) != 4){
            System.out.print(colors[index]+" ");
        }
    }

    public static void main(String[] args) {
        threadTest2 tt2 = new threadTest2();
        Thread t1 = new Thread(tt2);

        t1.start();
    }
}