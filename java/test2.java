import java.util.*;

class test2{
    
    public static void printAll(ArrayList<String> s){
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of Strings you want to enter : ");
        int num = input.nextInt();
        input.nextLine();
        //String in;
        for(int i=0; i<num; i++){
            System.out.println("Enter String : ");
            String in = input.nextLine();
            al.add(in);
        }   

        printAll(al);

    }
}