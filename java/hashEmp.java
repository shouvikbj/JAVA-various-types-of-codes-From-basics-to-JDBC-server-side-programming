import java.util.*;

class Employee{
    int eId;
    String eName;
    Employee(int eId, String eName){
        this.eId = eId;
        this.eName = eName;
    }
}

public class hashEmp{
    public static void main(String[] args) {

        Employee e1 = new Employee(100, "Amrita");
        Employee e2 = new Employee(101, "Shouvik");
        Employee e3 = new Employee(102, "Pal");
        Employee e4 = new Employee(103, "Bajpayee");

        HashSet<String> hs = new HashSet<String>();
        hs.add(e1.eName);
        hs.add(e2.eName);
        hs.add(e3.eName);
        hs.add(e4.eName);

        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}