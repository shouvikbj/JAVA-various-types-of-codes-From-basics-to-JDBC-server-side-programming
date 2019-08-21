import java.util.Scanner;

class loop10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int num = input.nextInt();
        for(int i=0; i<num; ++i){
            for(int j=0; j<=i; ++j){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        input.close();
    }
}