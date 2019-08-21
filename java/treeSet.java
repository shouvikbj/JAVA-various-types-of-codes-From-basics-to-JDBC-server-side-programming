import java.util.*;

public class treeSet{
    public static void main(String[] args) {
        int choice;
        System.out.println("1. Iterate through the TreeSet.");
        System.out.println("2. Check existance of an element.");
        System.out.println("3. Reverse the elements of the collection.");
        System.out.print("\nEnter Your Choice : ");

        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Shouvik");
        ts.add("Amrita");
        ts.add("Bajpayee");
        ts.add("Pal");

        switch(choice){
            case 1:
                Iterator itr = ts.iterator();
                while(itr.hasNext()){
                    System.out.print(itr.next()+" ");
                }
                break;
            
            case 2:
                System.out.print("Enter a String : ");
                String in = input.next();
                // input.nextLine();
                System.out.println("String present in the collection ?? =>> "+ts.contains(in));
                break;

            case 3:
                System.out.println("Reversed Order is :");
                Iterator itr3 = ts.descendingIterator();
                while(itr3.hasNext()){
                    System.out.print(itr3.next()+" ");
                }
                break;
            default:
                System.out.println("..Try Again..");

        }
        input.close();
    }
}