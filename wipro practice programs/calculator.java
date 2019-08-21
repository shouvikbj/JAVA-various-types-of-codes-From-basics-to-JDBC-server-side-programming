import java.lang.Math;

public class calculator{

    public static int powerInt(int a, int b){
        return (int)(Math.pow(a, b));
    }

    public static double powerDouble(double a, double b){
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        System.out.println(powerInt(4, 2));
        System.out.println(powerDouble(4.54, 2));
    }
}