import java.util.Scanner;

class array2{

    public int findMax(int a[]){
        int max = a[0];
        for(int i : a){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public int findMin(int a[]){
        int min = a[0];
        for(int i : a){
            if(i < min){
                min = i;
            }
        }
        return min;
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
        array2 a = new array2();
        System.out.println("Max Element : "+a.findMax(arr));
        System.out.println("Min Element : "+a.findMin(arr));
        input.close();
    }
}