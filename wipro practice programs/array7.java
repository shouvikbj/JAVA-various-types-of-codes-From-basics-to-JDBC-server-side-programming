import java.util.Scanner;

class array7{
    
    public static void print2Darray(int a[][], int n1, int n2){
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static int findMax(int a[][], int row, int col){
        int max = a[0][0];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int row = input.nextInt();
        System.out.print("Enter number of Columns : ");
        int col = input.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the Array Elements : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = input.nextInt();
            }
        }
        print2Darray(arr, row, col);
        System.out.println("Max element is : "+findMax(arr, row, col));
        input.close();
    }
}