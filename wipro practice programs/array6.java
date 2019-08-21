import java.util.Scanner;

class array6{

    public static void print2Darray(int a[][], int n1, int n2){
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] reverseArray(int a[][], int n1, int n2){
        int b[][] = new int[n1][n2];
        for(int i=(n1-1); i>=0; i--){
            for(int j=(n2-1); j>=0; j--){
                b[n1-i-1][n2-j-1] = a[i][j];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int row = input.nextInt();
        System.out.print("Enter number of Columns equal to Rows : ");
        int col = input.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the Array Elements : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = input.nextInt();
            }
        }
        print2Darray(arr, row, col);
        print2Darray(reverseArray(arr, row, row), row, col);
        input.close();
    }
}