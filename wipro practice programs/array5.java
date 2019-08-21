import java.util.Arrays;
import java.util.Scanner;

class array5{

    public int[] findDistinct(int a[], int n){
        if(n==0){
            return a;
        }
        else if(n==1){
            return a;
        }
        int temp[] = new int[a.length];
        int j=0;
        Arrays.sort(a);
        for(int i=0; i<(a.length-1); i++){
            if(a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n-1];
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Elements : ");
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        array5 ar5 = new array5();
        int arr2[] = ar5.findDistinct(arr, size);
        for(int j:arr2){
            System.out.print(j+" ");
        }
        input.close();
    }
}