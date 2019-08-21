import java.util.Scanner;

class loop7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean flag = false;
        System.out.print("Enter an integer : ");
        num = input.nextInt();
        for(int i=2; i<=num/2; ++i){
            if(num % i == 0){
                flag = true;
                break;
            }
        } 
        if(!flag){
            System.out.println(num + " is Prime.");
        }
        else{
            System.out.println(num + " is not Prime.");
        }
        input.close();
    }
}