import java.util.Arrays;
import java.util.Scanner;

class array4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Elements : ");
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr,0,(arr.length));
        System.out.println("Largest two elements : "+arr[arr.length-2]+" "+arr[arr.length-1]);
        System.out.println("Smallest two elements : "+arr[0]+" "+arr[1]);
        input.close();
    }
}