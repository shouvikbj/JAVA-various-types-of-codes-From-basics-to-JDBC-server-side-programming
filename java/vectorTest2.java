import java.util.*;

class Employee{
    int eId;
    String eName;
    Employee(int eId, String eName){
        this.eId = eId;
        this.eName = eName;
    }
    void showDetails(){
        System.out.println(eId+" "+eName);
    }
}

public class vectorTest2{
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Shouvik");
        Employee e2 = new Employee(101, "Amrita");
        Vector<Employee> vec = new Vector<Employee>();
        vec.addElement(e1);
        vec.addElement(e2);

        // Enumeration e = vec.elements();
        // while(e.hasMoreElements()){
        //     // e.nextElement().showDetails();
        //     System.out.println(e.nextElement().showDetails());
        // }
        Iterator<Employee> itr = vec.iterator();
        while(itr.hasNext()){
            itr.next().showDetails();
        }
    }
}